#!/usr/bin/env bash


docker-compose --file=docker-compose-devel.yml up -d
docker-compose --file=docker-compose-devel.yml unpause

