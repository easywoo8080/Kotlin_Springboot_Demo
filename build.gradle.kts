//import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.4"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.23"
	kotlin("plugin.spring") version "1.9.23"
	kotlin("plugin.jpa") version "1.9.23"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-mustache")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("com.h2database:h2")
	annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	/*2024-04-13 thymeleaf*/
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")

	/*2024-04-20 mybatis*/
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:3.0.3")
//	implementation("com.oracle.ojdbc:orai18n:19.3.0.0")
//	runtimeOnly("com.oracle.database.jdbc:ojdbc8")
//	runtimeOnly("com.mysql:mysql-connector-j")

	// https://mvnrepository.com/artifact/org.postgresql/postgresql
	implementation("org.postgresql:postgresql:42.7.3")

	runtimeOnly("org.postgresql:postgresql")

	implementation("org.springframework:spring-beans:6.1.5")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}


