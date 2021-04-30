# quickstart-demo
This is a small project that demonstrates how to start with the Cornershop test automation framework.

## Install and run tests
```
mvn install
```

## Run tests
```
mvn test
```

## Expected Output
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running shop.corner.suites.LoginTest
Configuring TestNG with: org.apache.maven.surefire.testng.conf.TestNG652Configurator@47f37ef1
LOGGER WARN: 'au.suite' could not be found in system properties
ChromeDriver was started successfully.
Apr 30, 2021 8:39:41 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
ChromeDriver was started successfully.
Apr 30, 2021 8:39:52 AM org.openqa.selenium.remote.ProtocolHandshake createSession
INFO: Detected dialect: W3C
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 20.309 sec

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  22.089 s
[INFO] Finished at: 2021-04-30T08:39:59-04:00
[INFO] ------------------------------------------------------------------------
```