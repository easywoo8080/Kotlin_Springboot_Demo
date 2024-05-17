
#?? ??
spring.application.name=demo
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html



#mybatis & DB
# Oracle Connection Settings
spring.datasource.driverClassName=
spring.datasource.url=
spring.datasource.username=
spring.datasource.password=

mybatis.type-aliases-package=com.example.demo.index.vo

mybatis.mapper-locations=classpath:/com/example/demo/index/mybatis/*.xml
mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl


#logging.level.root= DEBUG
#logging.level.org.springframework.web: DEBUG
#logging.level.org.hibernate: ERROR
