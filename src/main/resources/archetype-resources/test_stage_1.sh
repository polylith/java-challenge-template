#!/bin/bash

report_file="target/surefire-reports/TEST-${package}.${shortName}.challenge.stage1.ChallengeTest.xml"
error_file="error.txt"

mvn -q -Dtest=${package}.${shortName}.challenge.stage1.ChallengeTest clean surefire-report:report > ${error_file} 2>&1
if [ -e ${report_file} ]
then
    cat ${report_file}
else
    cat ${error_file}
fi
