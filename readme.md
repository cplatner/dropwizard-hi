# Hello-REST, Dropwizard version

## Simplified version of the Dropwizard Getting Started.

The [Dropwizard Getting Started](https://www.dropwizard.io/1.3.5/docs/getting-started.html) guide uses Maven for assembling and building.  I am not a Maven fan - I much prefer [Gradle](https://gradle.org).  With that in mind, I converted everything to use Gradle for dependency management and building.

## Building

After cloning this source, build it all:

```
gradle build
```

## Running

Now, run the application.  By default, ports 8080 and 8081 will be used, so they must be available.

```
gradle build
```

## Testing

Try it out using curl:

```
curl http://localhost:8080/hello-rest
curl http://localhost:8080/hello-rest?name=Joe
```

You can also access the Admin URL:

```
curl http://localhost:8081/

```

## References

* The original Dropwizard Getting Started guide:
  https://www.dropwizard.io/1.3.5/docs/getting-started.html
* Create fat jars using Gradle:
  https://imperceptiblethoughts.com/shadow/
* Notes on how to use the ShadowJar Gradle plugin to build
  Dropwizard projects:
  https://www.yunspace.com/post/dropwizard-gradle-build-with-shadowjar/
* Fix for an error I was getting:
  https://groups.google.com/forum/#!topic/dropwizard-user/3sPfYH9wzlY
* Fix for dealing with modules in Java versions 9 or later:
  https://stackoverflow.com/questions/43574426/how-to-resolve-java-lang-noclassdeffounderror-javax-xml-bind-jaxbexception-in-j
* General notes on how to migrate to JDK 9:
  https://docs.oracle.com/javase/9/migrate/
* Run the project via Gradle:
  https://stackoverflow.com/questions/28610015/run-main-method-using-gradle-run-task
