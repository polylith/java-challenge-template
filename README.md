# Java Challenge Template for the EntwicklerHeld Platform
This is a template (Maven Archetype) which sets up a java challenge project. There are 2 possibilities for the setup process.

## Prerequisite
You need have Maven to be installed. You can download it here: https://maven.apache.org/ 

## Installation Variant 1:
1. Clone repo
1. Run `mvn clean install`

## Installation Variant 2:
1. Download a release as jar file from the releases: https://github.com/polylith/java-challenge-template/releases 
1. Run the following command. Remember to set the `-Dfile` Parameter to the path to the jar file from step 1.
```bash
mvn install:install-file -Dfile=<path-to-jar> -DgroupId=de.entwicklerheld -DartifactId=java-challenge-template -Dversion=1.0-SNAPSHOT -Dpackaging=jar
```

## Usage
* Run following command in the target folder. It will create a new directory for the project according to your artifact id
```bash
mvn archetype:generate -DarchetypeGroupId=de.entwicklerheld -DarchetypeArtifactId=java-challenge-template -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=de.entwicklerheld -DartifactId=<name-of-your-challenge>
```
1. You will be asked after a version: Just press Enter here
1. You will be asked after a short name: Enter here the name of you challenge without dashed or underscores (it is used in package names)