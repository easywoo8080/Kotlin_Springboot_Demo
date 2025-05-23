#mybatis & DB
# Oracle Connection Settings
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://nivuskorea.asuscomm.com:847/postgres
spring.datasource.username=postgres
spring.datasource.password=47840847




#?? ??
spring.application.name=demo
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html


mybatis.type-aliases-package=com.example.demo.index.vo

mybatis.mapper-locations=classpath:/egovframework/com/mapper/*/*_postgres.xml
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl


#logging.level.root= DEBUG
#logging.level.org.springframework.web: DEBUG
#logging.level.org.hibernate: ERROR
