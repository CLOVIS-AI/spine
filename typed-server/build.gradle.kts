plugins {
	alias(opensavvyConventions.plugins.base)
	alias(opensavvyConventions.plugins.kotlin.library)
}

kotlin {
	jvm()
	linuxX64()

	sourceSets.commonMain.dependencies {
		api(projects.typedShared)

		api(libs.ktor.server.core)
	}

	sourceSets.commonTest.dependencies {
		implementation(libs.prepared)
		implementation(libs.prepared.arrow)
	}
}

library {
	name.set("Typed Ktor (server-side)")
	description.set("Typesafe HTTP APIs with Ktor")
	homeUrl.set("https://gitlab.com/opensavvy/spine")

	license.set {
		name.set("Apache 2.0")
		url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
	}
}