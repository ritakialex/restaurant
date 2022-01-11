#!/bin/sh

BASE_DIR=./src/main/resources/database

echo "Creating entities"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_entities.sql)" > /dev/null

echo "Creating logging entities"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/log_file.sql)" > /dev/null

echo "Creating functions"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_functions.sql)" > /dev/null

echo "Creating procedures"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_procedures.sql)" > /dev/null

echo "Creating triggers"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_triggers.sql)" > /dev/null

echo "Inserting base data"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/insert_base_entities.sql)" > /dev/null
