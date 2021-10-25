#!/bin/bash

# Start the spring boot
java -jar /app.jar &
# Start the filebeat
filebeat -e -strict.perms=false &

# Wait for any process to exit
wait -n

# Exit with status of process that exited first
exit $?