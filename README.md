# Example Jenkins Shared Library with Unit Tests

## Overview

Provides example code for setting up and unit testing shared jenkins libraries.

## Usage

1. Clone repository

    ```bash
    $ git clone https://github.com/stricklerxc/jenkins-test-library.git
    $ cd jenkins-test-library
    ```

2. Execute tests

    ```bash
    $ ./gradlew test
    <===========--> 90% EXECUTING [2s]

    > Task :test
    TestExample: testGetClusterUrl: SUCCESS
    Tests: 1, Failures: 0, Errors: 0, Skipped: 0

    BUILD SUCCESSFUL in 2s
    4 actionable tasks: 2 executed, 2 up-to-date
    ```

## References

- [Testing Jenkins Shared Libraries](https://medium.com/disney-streaming/testing-jenkins-shared-libraries-4d4939406fa2)