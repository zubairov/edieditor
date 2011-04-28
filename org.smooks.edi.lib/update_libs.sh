#!/bin/bash
export VERSION=1.5-SNAPSHOT
git rm -rf ./lib
mkdir -p lib
cp ~/.m2/repository/org/milyn/milyn-commons/${VERSION}/milyn-commons-${VERSION}.jar lib
cp ~/.m2/repository/org/milyn/milyn-edisax-parser/${VERSION}/milyn-edisax-parser-${VERSION}.jar lib
cp ~/.m2/repository/org/milyn/milyn-smooks-core/${VERSION}/milyn-smooks-core-${VERSION}.jar lib
cp ~/.m2/repository/org/milyn/milyn-smooks-ect/${VERSION}/milyn-smooks-ect-${VERSION}.jar lib
cp ~/.m2/repository/org/milyn/milyn-smooks-javabean/${VERSION}/milyn-smooks-javabean-${VERSION}.jar lib
git add lib
git status
