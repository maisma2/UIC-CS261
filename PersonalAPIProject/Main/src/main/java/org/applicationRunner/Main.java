package org.applicationRunner;

import okhttp3.*;
//import com.fasterxml.jackson.*;
//import com.google.api.*;

import java.io.IOException;
import java.util.Scanner;

import org.util.*;

//Handling HEIC to JPG conversion
//Uses Google Photo's API and OAuth Clients for image upload for easy batching
//Uses ConvertAPI to convert the files, using the REST api over SDK because this is a learning project
//Downloads the ConvertAPI into a destination folder

public class Main {
    public static void main(String[] args){
        try{
            final Logger logger = new Logger();
            FileHandling fileHandling = new FileHandling("src/main/source", "src/main/destination", logger);
            logger.log("FileHandling object created with source " + fileHandling.getSourcePath() + " and destination " + fileHandling.getDestinationPath());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}