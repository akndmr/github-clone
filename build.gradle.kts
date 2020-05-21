import io.gitlab.arturbosch.detekt.DetektPlugin
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

apply {
    plugin("io.gitlab.arturbosch.detekt")
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://jitpack.io") }

    }

    apply<DetektPlugin>()

    configure<DetektExtension> {
        input = project.files("src/main")
        config = files("$rootDir/.detekt/config.yml")
        reports {
            xml {
                enabled = true
                destination = project.file("build/reports/detekt/report.xml")
            }
            html {
                enabled = true
                destination = project.file("build/reports/detekt/report.html")
            }
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

