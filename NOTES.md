# compta-api — notes de TP

Une section par TP, dans l'ordre : `## TP 01`, `## TP 02`… puis `## Projet`.

Une prédiction s'écrit **avant** d'exécuter, et ne se corrige pas après : on écrit l'écart en dessous.
Une sortie se copie telle que le terminal l'affiche.

Voici ce qui se passe une fois que le server est lancée, :

``` bash
/Library/Java/JavaVirtualMachines/jdk-25.jdk/Contents/Home/bin/java -XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -Dmanagement.endpoints.jmx.exposure.include=* -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=50184 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter/target/classes:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/4.1.2/spring-boot-starter-actuator-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter/4.1.2/spring-boot-starter-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-logging/4.1.2/spring-boot-starter-logging-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/ch/qos/logback/logback-classic/1.5.38/logback-classic-1.5.38.jar:/Users/steevenhounkpe-sagbo/.m2/repository/ch/qos/logback/logback-core/1.5.38/logback-core-1.5.38.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.25.5/log4j-to-slf4j-2.25.5.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/apache/logging/log4j/log4j-api/2.25.5/log4j-api-2.25.5.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/slf4j/jul-to-slf4j/2.0.20/jul-to-slf4j-2.0.20.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/4.1.2/spring-boot-autoconfigure-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/annotation/jakarta.annotation-api/3.0.0/jakarta.annotation-api-3.0.0.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/yaml/snakeyaml/2.6/snakeyaml-2.6.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-micrometer-metrics/4.1.2/spring-boot-starter-micrometer-metrics-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-micrometer-metrics/4.1.2/spring-boot-micrometer-metrics-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-micrometer-observation/4.1.2/spring-boot-micrometer-observation-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/4.1.2/spring-boot-actuator-autoconfigure-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-actuator/4.1.2/spring-boot-actuator-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-health/4.1.2/spring-boot-health-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot/4.1.2/spring-boot-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-context/7.0.10/spring-context-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/io/micrometer/micrometer-observation/1.17.2/micrometer-observation-1.17.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/jspecify/jspecify/1.0.1/jspecify-1.0.1.jar:/Users/steevenhounkpe-sagbo/.m2/repository/io/micrometer/micrometer-commons/1.17.2/micrometer-commons-1.17.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/io/micrometer/micrometer-jakarta9/1.17.2/micrometer-jakarta9-1.17.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/io/micrometer/micrometer-core/1.17.2/micrometer-core-1.17.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/hdrhistogram/HdrHistogram/2.2.2/HdrHistogram-2.2.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-data-jpa/4.1.2/spring-boot-starter-data-jpa-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-jdbc/4.1.2/spring-boot-starter-jdbc-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/com/zaxxer/HikariCP/7.0.2/HikariCP-7.0.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/slf4j/slf4j-api/2.0.20/slf4j-api-2.0.20.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-data-jpa/4.1.2/spring-boot-data-jpa-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-data-commons/4.1.2/spring-boot-data-commons-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-persistence/4.1.2/spring-boot-persistence-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/data/spring-data-commons/4.1.2/spring-data-commons-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-hibernate/4.1.2/spring-boot-hibernate-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-jpa/4.1.2/spring-boot-jpa-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/persistence/jakarta.persistence-api/3.2.0/jakarta.persistence-api-3.2.0.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/hibernate/orm/hibernate-core/7.4.13.Final/hibernate-core-7.4.13.Final.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/hibernate/models/hibernate-models/1.1.2/hibernate-models-1.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/glassfish/jaxb/jaxb-runtime/4.0.9/jaxb-runtime-4.0.9.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/glassfish/jaxb/jaxb-core/4.0.9/jaxb-core-4.0.9.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/eclipse/angus/angus-activation/2.0.3/angus-activation-2.0.3.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/glassfish/jaxb/txw2/4.0.9/txw2-4.0.9.jar:/Users/steevenhounkpe-sagbo/.m2/repository/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-orm/7.0.10/spring-orm-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/data/spring-data-jpa/4.1.2/spring-data-jpa-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-aop/7.0.10/spring-aop-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-tx/7.0.10/spring-tx-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-beans/7.0.10/spring-beans-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/antlr/antlr4-runtime/4.13.2/antlr4-runtime-4.13.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-aspects/7.0.10/spring-aspects-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/aspectj/aspectjweaver/1.9.25.1/aspectjweaver-1.9.25.1.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-jdbc/4.1.2/spring-boot-jdbc-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-sql/4.1.2/spring-boot-sql-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-transaction/4.1.2/spring-boot-transaction-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-jdbc/7.0.10/spring-jdbc-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-validation/4.1.2/spring-boot-starter-validation-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-validation/4.1.2/spring-boot-validation-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/11.0.27/tomcat-embed-el-11.0.27.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/hibernate/validator/hibernate-validator/9.1.5.Final/hibernate-validator-9.1.5.Final.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/validation/jakarta.validation-api/3.1.1/jakarta.validation-api-3.1.1.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/jboss/logging/jboss-logging/3.6.3.Final/jboss-logging-3.6.3.Final.jar:/Users/steevenhounkpe-sagbo/.m2/repository/com/fasterxml/classmate/1.7.3/classmate-1.7.3.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-webmvc/4.1.2/spring-boot-starter-webmvc-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-jackson/4.1.2/spring-boot-starter-jackson-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-jackson/4.1.2/spring-boot-jackson-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/tools/jackson/core/jackson-databind/3.1.7/jackson-databind-3.1.7.jar:/Users/steevenhounkpe-sagbo/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.21/jackson-annotations-2.21.jar:/Users/steevenhounkpe-sagbo/.m2/repository/tools/jackson/core/jackson-core/3.1.7/jackson-core-3.1.7.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/4.1.2/spring-boot-starter-tomcat-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat-runtime/4.1.2/spring-boot-starter-tomcat-runtime-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/11.0.27/tomcat-embed-core-11.0.27.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/11.0.27/tomcat-embed-websocket-11.0.27.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-tomcat/4.1.2/spring-boot-tomcat-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-http-converter/4.1.2/spring-boot-http-converter-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-web/7.0.10/spring-web-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-webmvc/4.1.2/spring-boot-webmvc-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-servlet/4.1.2/spring-boot-servlet-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-webmvc/7.0.10/spring-webmvc-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-expression/7.0.10/spring-expression-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/mariadb/jdbc/mariadb-java-client/3.5.10/mariadb-java-client-3.5.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/xml/bind/jakarta.xml.bind-api/4.0.5/jakarta.xml.bind-api-4.0.5.jar:/Users/steevenhounkpe-sagbo/.m2/repository/jakarta/activation/jakarta.activation-api/2.1.4/jakarta.activation-api-2.1.4.jar:/Users/steevenhounkpe-sagbo/.m2/repository/net/bytebuddy/byte-buddy/1.18.15/byte-buddy-1.18.15.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/spring-core/7.0.10/spring-core-7.0.10.jar:/Users/steevenhounkpe-sagbo/.m2/repository/commons-logging/commons-logging/1.3.6/commons-logging-1.3.6.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/springframework/boot/spring-boot-web-server/4.1.2/spring-boot-web-server-4.1.2.jar:/Users/steevenhounkpe-sagbo/.m2/repository/org/projectlombok/lombok/1.18.48/lombok-1.18.48.jar org.sebsy.compta.ComptaApiApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.1.2)

2026-11-24T14:57:57.898+01:00  INFO 91832 --- [compta-api] [           main] org.sebsy.compta.ComptaApiApplication    : Starting ComptaApiApplication using Java 25.0.4.1 with PID 91832 (/Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter/target/classes started by steevenhounkpe-sagbo in /Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api)
2026-11-24T14:57:57.900+01:00  INFO 91832 --- [compta-api] [           main] org.sebsy.compta.ComptaApiApplication    : No active profile set, falling back to 1 default profile: "default"
2026-11-24T14:57:58.198+01:00  INFO 91832 --- [compta-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-11-24T14:57:58.209+01:00  INFO 91832 --- [compta-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 6 ms. Found 0 JPA repository interfaces.
2026-11-24T14:57:58.391+01:00  INFO 91832 --- [compta-api] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8081 (http)
2026-11-24T14:57:58.397+01:00  INFO 91832 --- [compta-api] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-11-24T14:57:58.397+01:00  INFO 91832 --- [compta-api] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.27]
2026-11-24T14:57:58.414+01:00  INFO 91832 --- [compta-api] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 491 ms
2026-11-24T14:57:58.509+01:00  INFO 91832 --- [compta-api] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-11-24T14:57:58.535+01:00  INFO 91832 --- [compta-api] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.4.13.Final
2026-11-24T14:57:58.696+01:00  INFO 91832 --- [compta-api] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-11-24T14:57:58.709+01:00  INFO 91832 --- [compta-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-11-24T14:57:58.747+01:00  INFO 91832 --- [compta-api] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.mariadb.jdbc.Connection@470135da
2026-11-24T14:57:58.748+01:00  INFO 91832 --- [compta-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-11-24T14:57:58.772+01:00  INFO 91832 --- [compta-api] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:mariadb://localhost/compta]
	Database driver: MariaDB Connector/J
	Database dialect: MariaDBDialect
	Database version: 12.3.3
	Default catalog/schema: compta/undefined
	Autocommit mode: undefined/unknown
	Isolation level: REPEATABLE_READ [default REPEATABLE_READ]
	JDBC fetch size: none
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-11-24T14:57:59.154+01:00  INFO 91832 --- [compta-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-24T14:57:59.171+01:00  INFO 91832 --- [compta-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-24T14:57:59.190+01:00  WARN 91832 --- [compta-api] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-11-24T14:57:59.366+01:00  INFO 91832 --- [compta-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2026-11-24T14:57:59.394+01:00  INFO 91832 --- [compta-api] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8081 (http) with context path '/'
2026-11-24T14:57:59.398+01:00  INFO 91832 --- [compta-api] [           main] org.sebsy.compta.ComptaApiApplication    : Started ComptaApiApplication in 1.699 seconds (process running for 2.011)
2026-11-24T14:57:59.660+01:00  INFO 91832 --- [compta-api] [on(1)-127.0.0.1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-11-24T14:57:59.660+01:00  INFO 91832 --- [compta-api] [on(1)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-11-24T14:57:59.661+01:00  INFO 91832 --- [compta-api] [on(1)-127.0.0.1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 1 ms

```

Une fois que le server est lacé, je check la santé de l'application avec `curl localhost:8081/actuator/health` et voici le résultat:
``` json
{"groups":["liveness","readiness"],"status":"UP"}%   
```

J'essaye ensuite de stoper la bdd:
```bash
steevenhounkpe-sagbo@MacBook-Air-de-Steeven env % docker compose stop db      

[+] stop 1/1
 ✔ Container atelier-spring-db Stopped                                                                                                                                      0.2s
steevenhounkpe-sagbo@MacBook-Air-de-Steeven env % 
```
Je relance le check de santé de l'application avec `curl -i localhost:8081/actuator/health` et voici le résultat:
```bash
Unable to obtain isolated JDBC connection [Socket fail to connect to localhost. Connection refused] 
```
Hibernate n'arrive pas à se connecter à la base de donnée pour voir une connexion JDBC isolée. Le code de retour est 503 Service Unavailable.

Je lance ensuite le test avec `./mvnw test` et voici le résultat:
```bash
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.292 s -- in org.sebsy.compta.DemarrageTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.701 s
[INFO] Finished at: 2026-11-24T15:06:40+01:00
[INFO] ------------------------------------------------------------------------
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % 
```

Le test fourni passe avec succès. Je commit ensuite les changements. 