#!/bin/bash

DIR=$( cd "$(dirname "$0")" >/dev/null 2>&1 || exit ; pwd -P )
ROOT_DIR="$DIR"/..
cd "$ROOT_DIR" || exit

if [ ! -d "$ROOT_DIR"/raw-classes ]; then
    mkdir -p "$ROOT_DIR"/src/main/java/raw-classes
fi

# 1. we compile the class under test castle.comp5111.example.Subject
echo "compiling castle.comp5111.example.Subject ..."
javac -g -d "$ROOT_DIR"/src/main/java/raw-classes "$ROOT_DIR"/src/main/java/comp5111/assignment/cut/Subject.java

# 2. we compile the classes to instrument Subject and count invocations using soot
echo "compiling instrumentation classes ..."
if [ ! -d "$ROOT_DIR"/src/main/java/target/classes ]; then
    mkdir -p "$ROOT_DIR"/src/main/java/target/classes
fi
find "$ROOT_DIR"/src -name "*.java" -print0 | xargs -0 \
  javac -classpath "$ROOT_DIR"/src/*:"$ROOT_DIR"/lib/* -d "$ROOT_DIR"/src/main/java/target/classes

echo please enter 0,1 or 2 where 0 = statement coverage, 1 = branch coverage or 2 = line coverage

read inputValue
# 3. we run the main method of castle.comp5111.example.EntryPoint
java -classpath .:"$ROOT_DIR"/lib/*:"$ROOT_DIR"/src/main/java/target/classes comp5111.assignment.Assignment1 $inputValue


