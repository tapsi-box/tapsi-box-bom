plugins {
  `java-platform`
  id("com.vanniktech.maven.publish") version "0.34.0"
}

group = "box.tapsi.libs"
version = "1.0.4"

dependencies {
  constraints {
    api("io.github.mahdibohloul:kpring-mediatr-starter:2.0.1")
    api("io.github.mahdibohloul:spring-reactor-kafka:1.0.0-RC1")
    api("cab.tapsi.libs.loggingstarter:tapsi-logging-starter:3.0.0")
    api("cab.tapsi.libs:localization-spring-boot-starter:0.0.2")
    api("cab.tapsi.libs.map-zones:tapsi-mapzones:3.0.0")
    api("io.github.mahdibohloul:projectreactor-retry-aop:2.0.0-RC2")
    api("io.github.mahdibohloul:statemachine:0.9.0")
    api("io.github.mahdibohloul:spring-setting-core:0.9.1")
    api("io.github.mahdibohloul:spring-setting-memory:0.9.1")
    api("io.github.mahdibohloul:spring-setting-mongodb:0.9.1")
    api("io.github.mahdibohloul:spring-setting-redis:0.9.1")
    api("box.tapsi.libs:metrics-core:1.0.4")
    api("box.tapsi.libs:utilities-starter:0.9.2")
    api("box.tapsi.libs:scheduler-starter:0.9.0")
  }
}

mavenPublishing {
  publishToMavenCentral()
  signAllPublications()

  pom {
    name.set("tapsi-box-bom")
    description.set("Tapsi Box Bill of Materials (BOM) for managing library dependencies")
    url.set("https://github.com/tapsi-box/tapsi-box-bom")

    licenses {
      license {
        name.set("MIT License")
        url.set("https://opensource.org/licenses/MIT")
      }
    }

    developers {
      developer {
        id.set("shahryarsafizadeh")
        name.set("Shahryar Safizadeh")
        email.set("szshahryar@gmail.com")
        url.set("https://github.com/shahryarSafizadeh")
      }
    }

    scm {
      url.set("https://github.com/tapsi-box/tapsi-box-bom")
    }
  }
}
