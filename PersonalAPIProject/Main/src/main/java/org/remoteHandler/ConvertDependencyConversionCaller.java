package org.remoteHandler;


import com.convertapi.client.Config;
import com.convertapi.client.ConversionResult;
import com.convertapi.client.ConvertApi;
import com.convertapi.client.Param;
import com.convertapi.client.model.User;
import org.util.APIConfigUtil;
import org.util.FileHandling;
import org.util.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import io.github.cdimascio.dotenv.*;

//This one uses the Maven dependency that Convert.io offers, it's a much simplier process
public class ConvertDependencyConversionCaller {
    private static final APIConfigUtil apiConfig = new APIConfigUtil();


    private boolean LoadAPI(Logger logger) throws ExecutionException, InterruptedException, IOException {
        try{
            Config.setDefaultSecret(apiConfig.getConvertAPISecret());
            Config.setDefaultApiKey(apiConfig.getConvertAPIKey());
            logger.log("ConvertAPI secret set");
            return true;
        }
        catch (Exception e){
            logger.log("ConvertAPI secret not set");
            return false;
        }
    }

    public boolean ConvertFileJPG(Logger logger, File image, String destination) throws ExecutionException, InterruptedException, IOException {
        try {
            if(LoadAPI(logger));
            else throw new IOException("API not loaded");
            String toDestination = destination + "/" + image.getName() + ".jpg";
            CompletableFuture<ConversionResult> result = ConvertApi.convert("heic", "jpg", new Param("file", Paths.get(image.getPath())));
            logger.log("File: " + image.getName() + " sent for conversion");
            result.get().saveFile(Paths.get(destination)).get();
            logger.log("File: " + image.getName() + " converted");

        } catch (Exception e) {
            logger.log("File not converted");
            logger.log(e.getMessage());
            return false;
        }

        return true;
    }
    /*
    public boolean ConvertFilePNG(Logger logger, File image, String destination) throws ExecutionException, InterruptedException, IOException {
        try {
            CompletableFuture<ConversionResult> result = ConvertApi.convert("heic", "png",
                    new Param("file", "https://cdn.convertapi.com/cara/testfiles/presentation.pptx")
            );

            Path pdfFile = Paths.get(System.getProperty("java.io.tmpdir") + "/myfile.pdf");
            result.get().saveFile(pdfFile).get();
        } catch (Exception e) {
            logger.log("File not converted");
            return false;
        }

        return true;
    }
     */
}
