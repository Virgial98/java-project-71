plugins {
    id("java")
    application
}

application { mainClass.set("hexlet.code.App") }

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    annotationProcessor("info.picocli:picocli-codegen:4.7.6")

    implementation("info.picocli:picocli:4.7.6")
}


tasks.test {
    useJUnitPlatform()
}