plugins {
    id("integraboost.plugin.module.java-project-plugin")
    id("application")
}

application {
    mainClass.set("integraboost.App")
}

dependencies {
    implementation("javax.activation:activation")
    implementation("jakarta.activation:jakarta.activation-api")
}