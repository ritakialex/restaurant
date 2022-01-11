#!/bin/sh

BASE_DIR=./src/main/resources/database

docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_entities.sql)"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/log_file.sql)"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_functions.sql)"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_procedures.sql)"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/create_triggers.sql)"
docker exec postgres psql -U postgres -c "$(cat $BASE_DIR/insert_base_entities.sql)"
