plugins {
    id("java-platform")
}

group = "com.integraboost.platform"

// allow the definition of dependencies to other platforms like the Spring Boot BOM
javaPlatform.allowDependencies()

dependencies {
//    api(platform("org.springframework.boot:spring-boot-dependencies:2.7.8"))

    constraints {
        api("org.apache.juneau:juneau-marshall:8.2.0")
    }
}
