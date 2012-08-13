Demonstrating a difference in behavior between specs2 v1.12 when tests
are run out of sbt and maven.

$ sbt clean test

    doBeforeSpec
    before
    ex2
    ex1
    after
    doAfterSpec

$ mvn clean test

    doBeforeSpec
    before
    after
    doAfterSpec
    ex1
    ex2
