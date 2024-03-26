# spring-boot-gradle-java-multi-module-boilerplate

This is a Spring Boot Gradle Java Multi Module boilerplate with the following modules:
- **app**
    - Responsible for the main application and YAML files
    - Responsible for integration with other modules
    - Depends on the other modules to assemble the application
- **microsoft-entra-ID-access-resource-server-example**
  - This example illustrates how to protect a Java Web API using Microsoft Entra ID by restricting access to its resources to authorized accounts only.
  - Reference: [Spring Boot Starter for Microsoft Entra developer's guide](https://learn.microsoft.com/en-us/azure/developer/java/spring-framework/spring-boot-starter-for-azure-active-directory-developer-guide?tabs=SpringCloudAzure5x)

This boilerplate has the following plugins integrated:
- [Spotless](https://github.com/diffplug/spotless) - Code Formatter
- [JaCoCo](https://github.com/jacoco/jacoco) - Java Code Coverage Library
- [SonarQube](https://plugins.gradle.org/plugin/org.sonarqube) - Static Code Analysis