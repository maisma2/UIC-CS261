#!/bin/bash

FILES="lab14_*.txt"
for i in $FILES; do
       cat "$i" >> output.txt
done
