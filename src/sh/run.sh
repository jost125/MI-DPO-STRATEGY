#!/bin/bash

usage() {
	echo "Usage: `basename $0` bfs|dfs"
        exit 1	
}

if [ $# -ne 1 ]
then
	usage
fi

if [[ ! $1 =~ [bd]fs ]]
then
	usage
fi

MY_PROGRAM=strategy.jar
JAVA_PROGRAM=java
$JAVA_PROGRAM -jar $MY_PROGRAM $1

