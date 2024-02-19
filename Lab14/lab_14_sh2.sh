#!/bin/bash

a=$1
b=5

if [[ $a -eq $b ]]; then
   echo "-$b"
elif [[ $a -eq 0 ]]; then
   echo "0"
else
   echo "No matches"
fi
