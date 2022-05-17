import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.7"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.21"
	kotlin("plugin.spring") version "1.6.21"
	// query dsl 사용을 위한 플러그인
	kotlin("plugin.jpa") version "1.6.20"
	// kotlin 에서 애너테이션 처리를 위한 플러그인
	kotlin("kapt") version "1.6.20"
}

group = "com.practice"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	// jpa 사용을 위한 라이브러리
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("com.querydsl:querydsl-core:5.0.0")
	implementation("com.querydsl:querydsl-jpa:5.0.0")
	implementation("junit:junit:4.13.1")
	kapt("com.querydsl:querydsl-apt:5.0.0:jpa")

	// spring boot
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	compileOnly("org.projectlombok:lombok")
	testCompileOnly("org.projectlombok:lombok")
	testAnnotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")

	// 메모리 db
	runtimeOnly("com.h2database:h2")

}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
