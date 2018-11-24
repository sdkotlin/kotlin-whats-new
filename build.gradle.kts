import org.gradle.api.JavaVersion.*
import org.gradle.api.tasks.wrapper.Wrapper.DistributionType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.3.10"
	id("com.github.ben-manes.versions") version "0.20.0"
}

group = "com.ianbrandt.kotlin"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
	jcenter()
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
		kotlinOptions {
			jvmTarget = VERSION_1_8.toString()
			freeCompilerArgs += "-XXLanguage:+InlineClasses"
		}
	}

	getByName<Wrapper>("wrapper") {
		gradleVersion = "4.10.2"
		distributionType = DistributionType.ALL
	}
}

