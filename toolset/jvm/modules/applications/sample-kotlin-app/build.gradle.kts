plugins {
  id("my.kotlin-jvm-app")
}

dependencies {
  versionConstraints(platform("org.springframework.boot:spring-boot-dependencies"))
  implementation(project(":modules:libraries:sample-java-lib"))
  implementation("org.apache.commons:commons-lang3")
}

application {
  mainClass.set("com.nophasenokill.app.MainKt")
}
