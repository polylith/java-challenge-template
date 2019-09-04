# Java Challenge Template for the EntwicklerHeld Platform
<p align="center"> 
<img src="https://platform.entwicklerheld.de/assets/img/plumplori-gray-shirt.png" height=150>
</p>
This is a template (Maven Archetype) which sets up a java challenge project. There are 2 possibilities for the setup process.

## Set Up your Environment
1. Install Java JDK 12 (recommended)
   * Go to Java JDK downlaod page: https://jdk.java.net/12/
   * Download the right installer version for your operating system (.exe, .dmg, .deb)
   * Install the Java JDK
   * Make shure the JAVA_HOME path is set to the JDK (you can check it with maven later)

2. Install Maven
   * Go to Maven download page: https://maven.apache.org/download.cgi
   * Download the zip version
   * Extract the files to their final location (e.g. `C:\\Program Files\maven` or a Unix loaction)
   * Add the bin path from the maven folder to your PATH environment variable
   * Check installation with `mvn --version` (Important is the Java and the Maven version)
      ```bash
      Apache Maven 3.6.1 (d66c9c0b3152b2e69ee9bac180bb8fcc8e6af555; 2019-04-04T21:00:29+02:00)
      Maven home: C:\Program Files\Java\apache-maven-3.6.1\bin\..
      Java version: 12.0.1, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-12.0.1
      Default locale: de_DE, platform encoding: Cp1252
      OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows" 
      ```
3. Install the packages
   1. Install Variant 1: (recommended)
      * Download a release as jar file from the releases: https://github.com/polylith/java-challenge-template/releases
      * Run the following command. Remember to set the `-Dfile` Parameter to the path to the jar file from step 1.
        ```bash
        mvn install:install-file -Dfile=<path-to-jar> -DgroupId=de.entwicklerheld -DartifactId=java-challenge-template -Dversion=1.0-SNAPSHOT -Dpackaging=jar
        ```

   1. Installation Variant 1:
      * Clone repo
      * Run `mvn clean install`
4. Now you are ready to create a java-challenge-project. Please read the [Create the Project](#create-the-Project) section


## Create the Project
1. If you cloned the git repo:
    * Move to the target directory

2. If you installed it with the jar file:
    * Go to the final loaction for your project
3. Run following command in the target folder. It will create a new directory for the project according to your artifact id. Don't forget to set the `-DartifactId` Parameter to the short name of your Challenge.
    ```bash
    mvn archetype:generate -DarchetypeGroupId=de.entwicklerheld -DarchetypeArtifactId=java-challenge-template -DarchetypeVersion=1.0-SNAPSHOT -DgroupId=de.entwicklerheld -DartifactId=<name-of-your-challenge>
    ```
4. You will be asked to specify a version: `Define value for property 'version' 1.0-SNAPSHOT: :` **Just press Enter here**
5. You will be asked to specify a a short name for the Challenge: `Define value for property 'shortName':` **Enter the name of you challenge without dashed or underscores (it is used in package names) here.**
6. Now open the created folder named like your project name with your favorite IDE
7. If your Java Version is not correct insert the following to your pom.xml and run `mvn install`
    ```xml
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.0</version>
        <configuration>
            <release>8</release>
        </configuration>
    </plugin>
    ```

## Write your Challenge
1. A Challenge includes the following parts:
    * A Blank Template for the User
    * Unit-tests for all tasks and stages
2. Write the blank template
    * The blank template is located at: \
    `scr/main/java/de/entwicklerheld/<challenge-name>\challenge\stage1\Example.java`
    * Remeber to rename the filename if you change the classname
    * For unimplementet functions use `RuntimeException`
    * For testing purpose you can write your implementation to this file
3. Write the JUnit test
    * The JUnit version is JUnit 5. Please read the documentation even if you know JUnit 4, because some major things changed.
    * Please be aware of adding messages to the assertion
    * The tests are located at: \
    `scr/test/java/de/entwicklerheld/<challenge-name>\challenge\stage1\ExampleChallengeTest.java`
    * Remeber to rename the filename if you change the classname
    * Tests need to be repeatable and must have enough testcases to avoid hardcoding
4. Write the story flow:
    * The story flow file is located at: \
    `scr/test/java/de/entwicklerheld/<challenge-name>\challenge\stage1\stage1.md`
    * There is no formatting needed, its only the plain story text. You can use .md commands in this file to structure it.

## Finish your work
1. Make shure to clear your implementation from the blank template
2. Run the shurefire plugin with the commmand in your project folder
    ```bash
    mvn surefire:test
    ```
3. There are two different options to send your work to Entwicklerheld:
    1. Create a Github project and share the link with Entwicklerheld
    2. Zip your projectfolder and send it over to Entwicklerheld