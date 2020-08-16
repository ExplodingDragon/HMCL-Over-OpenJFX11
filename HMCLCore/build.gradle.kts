
plugins {
    id("org.openjfx.javafxplugin") version "0.0.9"
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.2")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
repositories {
    maven { url = uri("https://maven.aliyun.com/repository/public/") }
    jcenter()
    maven { url = uri("https://jitpack.io") }

}

javafx {
    version = "11.0.2"

    modules("javafx.controls", "javafx.fxml","javafx.swing","javafx.media","javafx.graphics","javafx.web")}

