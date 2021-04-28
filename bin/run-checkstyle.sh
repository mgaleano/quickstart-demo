#!/bin/sh
printf "Checkstyle... "
mvn verify -DskipTests &> /dev/null

if [ $? -eq 0 ]; then
  echo "success!"
  exit 0
else
  echo "failure. Please, review it running: mvn checkstyle:check" >&2
  exit 1
fi
