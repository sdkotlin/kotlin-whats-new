import org.gradle.api.JavaVersion.*
import org.gradle.api.tasks.wrapper.Wrapper.DistributionType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	java
	kotlin("jvm") version "1.3.0"
	id("com.github.ben-manes.versions") version "0.20.0"
}

group = "com.ianbrandt.kotlin"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
	jcenter()
	maven("https://dl.bintray.com/kotlin/kotlin-eap")
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))
}

java {
	sourceCompatibility = VERSION_1_8
	targetCompatibility = VERSION_1_8
}

tasks {

	withType<KotlinCompile> {
		kotlinOptions.jvmTarget = VERSION_1_8.toString()
	}

	getByName<Wrapper>("wrapper") {
		gradleVersion = "4.10.2"
		distributionType = DistributionType.ALL
	}
}
