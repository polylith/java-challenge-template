# Java Challenge Template for the EntwicklerHeld Platform
This is a template (Maven Archetype) which sets up a java challenge project

## Installation Variant 1:
* Clone repo
* Run `mvn clean install`

## Installation Variant 2:
* Download a release as jar file
* Run
```
mvn install:install-file -Dfile=<path-to-jar> -DgroupId=de.entwicklerheld -DartifactId=java-challenge-template -Dversion=1.0-SNAPSHOT -Dpackaging=jar
```

## Usage
* Run following command in the target folder. It will create a new directory for the project according to your artifact id
```
mvn archetype:generate -DarchetypeGroupId=de.entwicklerheld -DarchetypeArtifactId=java-challenge-template -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=de.entwicklerheld -DartifactId=<name-of-your-challenge>
```
* You will be asked after a short name: Enter here the name of you challenge without dashed or underscores (it is used in package names)
* You will be asked after a version: Just press Enter here
