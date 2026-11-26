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

Apres avoir modifié la ligne `@Column(name = "date_cmde"` par `@Column(name = "date_commande"`, je relance l'application et voici le résultat:
```bash
Caused by: org.hibernate.tool.schema.spi.SchemaManagementException: Schema validation: missing column [date_commande] in table [bon]
	at org.hibernate.tool.schema.internal.AbstractSchemaValidator.validateTable(AbstractSchemaValidator.java:141) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
	at org.hibernate.tool.schema.internal.GroupedSchemaValidatorImpl.validateTables(GroupedSchemaValidatorImpl.java:42) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
	at org.hibernate.tool.schema.internal.AbstractSchemaValidator.performValidation(AbstractSchemaValidator.java:97) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
	at org.hibernate.tool.schema.internal.AbstractSchemaValidator.doValidation(AbstractSchemaValidator.java:75) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.performDatabaseAction(SchemaManagementToolCoordinator.java:278) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.lambda$process$1(SchemaManagementToolCoordinator.java:101) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
	at java.base/java.util.HashMap.forEach(HashMap.java:1430) ~[na:na]
	at org.hibernate.tool.schema.spi.SchemaManagementToolCoordinator.process(SchemaManagementToolCoordinator.java:100) ~[hibernate-core-7.4.13.Final.jar:7.4.13.Final]
```
Ça été refusé par Hibernate car la colonne `date_commande` n'existe pas dans la table `bon`. 
C'est une bonne nouvelle car en premier : 
- lieu ça permet de vérifier que la colonne `date_commande` est bien mappée à la table `bon`.
- Ensuite ça permet de mettre de la sécurité sur le code, pour éviter de créer des colonnes qui n'existent pas dans la base de données ou même des tables.
- Enfin ça permet de vérifier que la base de données est bien synchronisée avec le code.

Je crée ensuite le `jar` avec la commande `./mvnw package` et voici le résultat:
```bash
[INFO] Replacing main artifact /Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter/target/compta-api-0.0.1-SNAPSHOT.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to /Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter/target/compta-api-0.0.1-SNAPSHOT.jar.original
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.389 s
[INFO] Finished at: 2026-11-24T15:25:38+01:00
[INFO] ------------------------------------------------------------------------
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % 
```

Le jar est bien crée. Je le lance ensuite sur le port 8082 pour tester (alors qu'il a été compilé avec le port 8081).
``` bash
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % java -jar target/compta-api-0.0.1-SNAPSHOT.jar --server.port=8082

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.1.2)

2026-11-24T15:29:42.559+01:00  INFO 94214 --- [compta-api] [           main] org.sebsy.compta.ComptaApiApplication    : Starting ComptaApiApplication v0.0.1-SNAPSHOT using Java 25.0.4.1 with PID 94214 (/Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter/target/compta-api-0.0.1-SNAPSHOT.jar started by steevenhounkpe-sagbo in /Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter)
2026-11-24T15:29:42.561+01:00  INFO 94214 --- [compta-api] [           main] org.sebsy.compta.ComptaApiApplication    : No active profile set, falling back to 1 default profile: "default"
2026-11-24T15:29:42.954+01:00  INFO 94214 --- [compta-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-11-24T15:29:42.962+01:00  INFO 94214 --- [compta-api] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 4 ms. Found 0 JPA repository interfaces.
2026-11-24T15:29:43.200+01:00  INFO 94214 --- [compta-api] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8082 (http)
2026-11-24T15:29:43.207+01:00  INFO 94214 --- [compta-api] [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-11-24T15:29:43.207+01:00  INFO 94214 --- [compta-api] [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.27]
2026-11-24T15:29:43.222+01:00  INFO 94214 --- [compta-api] [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 619 ms
2026-11-24T15:29:43.354+01:00  INFO 94214 --- [compta-api] [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-11-24T15:29:43.393+01:00  INFO 94214 --- [compta-api] [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.4.13.Final
2026-11-24T15:29:43.613+01:00  INFO 94214 --- [compta-api] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-11-24T15:29:43.630+01:00  INFO 94214 --- [compta-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-11-24T15:29:43.704+01:00  INFO 94214 --- [compta-api] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.mariadb.jdbc.Connection@2db461b5
2026-11-24T15:29:43.704+01:00  INFO 94214 --- [compta-api] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-11-24T15:29:43.736+01:00  INFO 94214 --- [compta-api] [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
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
2026-11-24T15:29:44.217+01:00  INFO 94214 --- [compta-api] [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
2026-11-24T15:29:44.247+01:00  INFO 94214 --- [compta-api] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-11-24T15:29:44.273+01:00  WARN 94214 --- [compta-api] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-11-24T15:29:44.475+01:00  INFO 94214 --- [compta-api] [           main] o.s.b.a.e.web.EndpointLinksResolver      : Exposing 1 endpoint beneath base path '/actuator'
2026-11-24T15:29:44.511+01:00  INFO 94214 --- [compta-api] [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8082 (http) with context path '/'
2026-11-24T15:29:44.515+01:00  INFO 94214 --- [compta-api] [           main] org.sebsy.compta.ComptaApiApplication    : Started ComptaApiApplication in 2.154 seconds (process running for 2.392)
2026-11-24T15:30:28.499+01:00  INFO 94214 --- [compta-api] [nio-8082-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-11-24T15:30:28.499+01:00  INFO 94214 --- [compta-api] [nio-8082-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-11-24T15:30:28.503+01:00  INFO 94214 --- [compta-api] [nio-8082-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 4 ms
```

Le résultat est positif, et il me montre que c'est l'argument qui gagne sur le port de l'application. Le port 8082 est bien pris en compte par l'application.

## TP 2

#### 1 - J'ai copié le contenu du projet starter qui est dans le TP 2 dans le TP1. Et j'ai exécuté, et j'ai eu des erreurs de compilation car certaines routes n'existaient pas.
Voici le résultat de l'exécution:
```
MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /api/devis
       Parameters = {prixHt=[2.25]}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = org.springframework.web.servlet.resource.ResourceHttpRequestHandler

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = org.springframework.web.servlet.resource.NoResourceFoundException

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 404
    Error message = No static resource api/devis.
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /api/devis
       Parameters = {prixHt=[2.25], quantite=[10]}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = org.springframework.web.servlet.resource.ResourceHttpRequestHandler

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = org.springframework.web.servlet.resource.NoResourceFoundException

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 404
    Error message = No static resource api/devis.
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /api/devis/3
       Parameters = {prixHt=[74.99]}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = org.springframework.web.servlet.resource.ResourceHttpRequestHandler

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = org.springframework.web.servlet.resource.NoResourceFoundException

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 404
    Error message = No static resource api/devis/3.
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /api/devis
       Parameters = {prixHt=[74.99], quantite=[3]}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = org.springframework.web.servlet.resource.ResourceHttpRequestHandler

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = org.springframework.web.servlet.resource.NoResourceFoundException

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 404
    Error message = No static resource api/devis.
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []

MockHttpServletRequest:
      HTTP Method = GET
      Request URI = /api/devis
       Parameters = {quantite=[3]}
          Headers = []
             Body = null
    Session Attrs = {}

Handler:
             Type = org.springframework.web.servlet.resource.ResourceHttpRequestHandler

Async:
    Async started = false
     Async result = null

Resolved Exception:
             Type = org.springframework.web.servlet.resource.NoResourceFoundException

ModelAndView:
        View name = null
             View = null
            Model = null

FlashMap:
       Attributes = null

MockHttpServletResponse:
           Status = 404
    Error message = No static resource api/devis.
          Headers = []
     Content type = null
             Body = 
    Forwarded URL = null
   Redirected URL = null
          Cookies = []
[ERROR] Tests run: 5, Failures: 5, Errors: 0, Skipped: 0, Time elapsed: 0.042 s <<< FAILURE! -- in org.sebsy.compta.web.DevisControllerTest
[ERROR] org.sebsy.compta.web.DevisControllerTest.quantiteParDefaut -- Time elapsed: 0.021 s <<< FAILURE!
org.opentest4j.AssertionFailedError: 
[HTTP status code] 
expected: 200
 but was: 404
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:185)
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:195)
        at org.sebsy.compta.web.DevisControllerTest.quantiteParDefaut(DevisControllerTest.java:31)

[ERROR] org.sebsy.compta.web.DevisControllerTest.remiseDeVolumeParDefaut -- Time elapsed: 0.003 s <<< FAILURE!
org.opentest4j.AssertionFailedError: 
[HTTP status code] 
expected: 200
 but was: 404
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:185)
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:195)
        at org.sebsy.compta.web.DevisControllerTest.remiseDeVolumeParDefaut(DevisControllerTest.java:46)

[ERROR] org.sebsy.compta.web.DevisControllerTest.parVariableDeChemin -- Time elapsed: 0.004 s <<< FAILURE!
org.opentest4j.AssertionFailedError: 
[HTTP status code] 
expected: 200
 but was: 404
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:185)
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:195)
        at org.sebsy.compta.web.DevisControllerTest.parVariableDeChemin(DevisControllerTest.java:39)

[ERROR] org.sebsy.compta.web.DevisControllerTest.parParametres -- Time elapsed: 0.002 s <<< FAILURE!
org.opentest4j.AssertionFailedError: 
[HTTP status code] 
expected: 200
 but was: 404
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:185)
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:195)
        at org.sebsy.compta.web.DevisControllerTest.parParametres(DevisControllerTest.java:23)

[ERROR] org.sebsy.compta.web.DevisControllerTest.prixManquant -- Time elapsed: 0.002 s <<< FAILURE!
org.opentest4j.AssertionFailedError: 
[HTTP status code] 
expected: 400
 but was: 404
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:185)
        at org.springframework.test.web.servlet.assertj.AbstractHttpServletResponseAssert.hasStatus(AbstractHttpServletResponseAssert.java:195)
        at org.sebsy.compta.web.DevisControllerTest.prixManquant(DevisControllerTest.java:53)

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Failures: 
[ERROR]   DevisControllerTest.parParametres:23 [HTTP status code] 
expected: 200                                                                                                                                                                   
 but was: 404                                                                                                                                                                   
[ERROR]   DevisControllerTest.parVariableDeChemin:39 [HTTP status code] 
expected: 200                                                                                                                                                                   
 but was: 404                                                                                                                                                                   
[ERROR]   DevisControllerTest.prixManquant:53 [HTTP status code] 
expected: 400                                                                                                                                                                   
 but was: 404                                                                                                                                                                   
[ERROR]   DevisControllerTest.quantiteParDefaut:31 [HTTP status code] 
expected: 200                                                                                                                                                                   
 but was: 404                                                                                                                                                                   
[ERROR]   DevisControllerTest.remiseDeVolumeParDefaut:46 [HTTP status code] 
expected: 200                                                                                                                                                                   
 but was: 404                                                                                                                                                                   
[INFO] 
[ERROR] Tests run: 6, Failures: 5, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.657 s
[INFO] Finished at: 2026-11-26T08:55:39+01:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:3.5.6:test (default-test) on project compta-api: There are test failures.
[ERROR] 
[ERROR] See /Users/steevenhounkpe-sagbo/Documents/Devs/Java SpringBoot/tp-01-demarrer-compta-api/projet-starter/target/surefire-reports for the individual test results.
[ERROR] See dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

Il explique que les routes n'existent pas.

#### 2 - Je crée une interface:
Je crée que je nomme 'Remise' et que DevisService va implémenter. Cette interface contient une méthode BigDécimal taux qui prends en parmaètre uen quatité.
```

public interface Remise {
     BigDecimal taux(int quantite);
}
```

#### 3 Je crée ensuite le fichier service.
```
package org.sebsy.compta.service;

import org.sebsy.compta.devis.Devis;
import org.sebsy.compta.devis.Remise;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class DevisService {

    private final Remise remise;

    public DevisService(Remise remise) {
        this.remise = remise;
    }

    public Devis calculer(BigDecimal prixHt, int quantite) {
        return Devis.calculer(prixHt, quantite, remise);
    }
}
```

##### Création du fichier controller
```
package org.sebsy.compta.web;

import java.math.BigDecimal;

import org.sebsy.compta.devis.Devis;
import org.sebsy.compta.service.DevisService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/devis")
@RequiredArgsConstructor
public class DevisController {

    private final DevisService devisService;

    @GetMapping
    public Devis calculerDevis(@RequestParam BigDecimal prixHt, @RequestParam(defaultValue = "1") int quantite
    ) {
        return devisService.calculer(prixHt, quantite);
    }
}
```

Test du controller
```
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % curl "localhost:8081/api/devis?prixHt=2.25&quantite=10"
{"quantite":10,"ht":22.50,"ttc":27.00}%  
```
Explication du résultat: Le résultat est positif, le controller fonctionne bien. Il calcule le devis avec le prix HT et la quantité. Le résultat est bien en JSON.

Un autre test avec la quantité par défaut:
```
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % curl "localhost:8081/api/devis/3?prixHt=74.99"         
{"timestamp":"2026-11-26T09:09:26.450Z","status":404,"error":"Not Found","trace":"org.springframework.web.servlet.resource.NoResourceFoundException:
 No static resource api/devis/3 for request '/api/devis/3'.\n\tat org.springframework.web.servlet.resource.ResourceHttpRequestHandler.handleRequest(ResourceHttpRequestHandler.java:527)\n\tat
 org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter.handle(HttpRequestHandlerAdapter.java:50)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963)\n\tat
 org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:866)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1000)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:892)\n\tat
 jakarta.servlet.http.HttpServlet.service(HttpServlet.java:622)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:874)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:710)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:132)\n\tat
 org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:59)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat
 org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat
 org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:110)\n\tat
 org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:199)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat
 org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:164)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:77)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:540)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:86)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:71)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:347)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:411)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:71)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:1308)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:2202)\n\tat
 org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:74)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:947)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:481)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:74)\n\tat java.base/java.lang.Thread.run(Thread.java:1474)\n","message":"No static resource api/devis/3.","path":"/api/devis/3"}%  
```

Cette erreur signifie que la route `/api/devis/3` n'existe pas.
Le controller ne gère pas les requêtes avec un identifiant dans l'URL, il ne prend en charge que les requêtes avec des paramètres de requête (query parameters).

##### Un autre test avec la quantité à 3
```
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % curl "localhost:8081/api/devis?quantite=3"
{"timestamp":"2026-11-26T09:13:46.077Z","status":400,"error":"Bad Request","trace":"org.springframework.web.bind.MissingServletRequestParameterException: Required request parameter 'prixHt' for method parameter type BigDecimal is not present\n\tat org.springframework.web.method.annotation.RequestParamMethodArgumentResolver.handleMissingValueInternal(RequestParamMethodArgumentResolver.java:219)\n\tat org.springframework.web.method.annotation.RequestParamMethodArgumentResolver.handleMissingValue(RequestParamMethodArgumentResolver.java:195)\n\tat org.springframework.web.method.annotation.AbstractNamedValueMethodArgumentResolver.resolveArgument(AbstractNamedValueMethodArgumentResolver.java:123)\n\tat org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:122)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:224)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:174)\n\tat org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:934)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:853)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:86)\n\tat org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:963)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:866)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1000)\n\tat org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:892)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:622)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:874)\n\tat jakarta.servlet.http.HttpServlet.service(HttpServlet.java:710)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:132)\n\tat org.apache.tomcat.websocket.server.WsFilter.doFilter(WsFilter.java:59)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.ServerHttpObservationFilter.doFilterInternal(ServerHttpObservationFilter.java:110)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:199)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:116)\n\tat org.apache.catalina.core.ApplicationFilterChain.doFilter(ApplicationFilterChain.java:111)\n\tat org.apache.catalina.core.StandardWrapperValve.invoke(StandardWrapperValve.java:164)\n\tat org.apache.catalina.core.StandardContextValve.invoke(StandardContextValve.java:77)\n\tat org.apache.catalina.authenticator.AuthenticatorBase.invoke(AuthenticatorBase.java:540)\n\tat org.apache.catalina.core.StandardHostValve.invoke(StandardHostValve.java:115)\n\tat org.apache.catalina.valves.ErrorReportValve.invoke(ErrorReportValve.java:86)\n\tat org.apache.catalina.core.StandardEngineValve.invoke(StandardEngineValve.java:71)\n\tat org.apache.catalina.connector.CoyoteAdapter.service(CoyoteAdapter.java:347)\n\tat org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:411)\n\tat org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:71)\n\tat org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:1308)\n\tat org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:2202)\n\tat org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:74)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:947)\n\tat org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:481)\n\tat org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:74)\n\tat java.base/java.lang.Thread.run(Thread.java:1474)\n","message":"Required parameter 'prixHt' is not present.","path":"/api/devis"}%                                                                                 steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % 
```

#### Faisons de RemiseVolume la remise par défaut. Rejouons le premier appel de l'étape 4 et copiez la réponse. 

```
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % curl "localhost:8081/api/devis?prixHt=2.25&quantite=10"
{"quantite":10,"ht":21.38,"ttc":25.66}%  
```

Le résultat est positif, le controller fonctionne bien. Il calcule le devis avec le prix HT et la quantité. Le résultat est bien en JSON. La remise par défaut est bien appliquée.

Et la commande './mvnw test' est bien passée avec succès.
```
[INFO] Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.036 s -- in org.sebsy.compta.web.DevisControllerTest
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.685 s
[INFO] Finished at: 2026-11-26T10:31:50+01:00
[INFO] ------------------------------------------------------------------------
steevenhounkpe-sagbo@MacBook-Air-de-Steeven projet-starter % 
```

##### Je commit
