# Reading external configuration file

Think: After deploy, how can I read a external "application.properties" or "application.yml"?

It's very simple: Just add tags in pom.xml: 
```xml
  <plugin>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-maven-plugin</artifactId>
    <configuration>
      <layout>ZIP</layout>
    </configuration>
  </plugin>
```
