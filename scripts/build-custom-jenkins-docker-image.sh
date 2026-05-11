#!/usr/bin/env bash
set -eu

# src: https://www.jenkins.io/doc/book/installing/docker/#downloading-and-running-jenkins-in-docker

docker build -t myjenkins-blueocean:2.555.1-1 .