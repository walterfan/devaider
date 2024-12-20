#!/bin/bash
PROJECT_NAME="devaider"
PROJECT_VERSION="1.0.0"

CI_PIPELINE_ID="latest"
BRANCH_NAME="develop"

if [ -n "$1" ]; then
    CI_PIPELINE_ID=$1
fi

if [ -n "$2" ]; then
    BRANCH_NAME=$2
fi


IMAGE=$PROJECT_NAME:$PROJECT_VERSION.$CI_PIPELINE_ID;
mvn clean package
echo "start building and pushing image $IMAGE ..."
docker build -t $IMAGE .

if [[ "$BRANCH_NAME" == "master" ]]; then
    docker push $IMAGE
    TAG=$HUB_HOST/$HUB_PROJECT_QA/$PROJECT_NAME:latest;
    docker tag $IMAGE $TAG;
    docker push $TAG;
    docker rmi $TAG;
fi
#docker rmi $IMAGE
