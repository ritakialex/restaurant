#!/bin/sh

docker run -d --restart always -p 5432:5432 --name postgres --network mock-net -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=postgres postgres:12
