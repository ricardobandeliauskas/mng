plugins {
	kotlin("multiplatform")
}

kotlin {

	jvm()

	js(IR) {
		browser()
	}

	sourceSets {
		val commonMain by getting
		val commonTest by getting {
			dependencies {
				implementation(kotlin("test"))
			}
		}
		val jvmMain by getting
		val jvmTest by getting
		val jsMain by getting
		val jsTest by getting
	}

}

repositories {
	mavenCentral()
	google()
}