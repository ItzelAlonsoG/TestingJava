# TestingJava

# Content
- Introduction
- Excercise
- Install
- Information

# Introduction
**Unit tests** are tests where individual components of a program are tested (an example could be the testing of a function or a class).
They consist of introducing a set of inputs within a code and determining if the set of output is as expected. That is, check if the returned values are correct or not. And handle failures, if an unexpected value is provided.
The purpose of this type of testing is to ensure that each component works in isolation. Also, that everything works as expected, and that everything responds as it should. And what fails when it should and how it should fail. And accept what you have to accept.

There are automatic and manual tests the automatic ones will require development time and sometimes they will not be as viable, but if possible always try to do automatic tests since.

**Mockito** is a mocking framework that tastes really good. It lets you write beautiful tests with a clean & simple API. Mockito doesn’t give you hangover because the tests are very readable and they produce clean verification errors.

Test types
- **Unitary:** they perform tests on a very specific function or class of our project.
- **Integration:** they test how different components of our project are connected.
- **Functional:** they test a functionality of our project, several classes can be involved.
- **Start to finish:** tests an entire project process.
- **Stress:** useful to test if our application can support large amounts of processes and requests at the same time.

**The Test Driven Development (TDD)** or test-guided development, created by Kent Beck, consists of first writing the tests before the classes, allowing you to see if the design of a class is adequate.

The TDD cycle
- Red: write a test that fails.
- Green: write the code necessary to pass the test.
- Refactor: improve the code.

Rules
1. You will only write test code until it fails.
2. You will only write production code to pass the test.
You will not write more production code than necessary.

<div><img src ="https://miro.medium.com/max/1000/0*FZRoLf8lCyFSqw8t.png" width ="400px"></div>

# Excercise

In this repository we attend a  Movie Service,  using the TDD and created a diferentes situations that the project it will do like, find by name, director, duration, etc. 
Each one of that situacions is a Unit test made it with JUnit.

It consist en this operations:
- Price calculator
- find all Movies
- find Movie by ID
- Insert a movie
- find Movies by name
- find Movies by director
- Before annotation
- After annotation
- Test annotation

# Install

- Intellj or another IDE thats supports JDK 8 or later and contains maven
- JDK 8 or later
- junit 4.13.2 
- Add mockito-core 3.11.1 
- Add spring-jdbc 5.1.3 

# Information

For more about Test yo can check [Platzi Testing JavaCourse](https://platzi.com/clases/testing-java/ )

For search pom.xml maven dependencies [click here](https://mvnrepository.com/)
