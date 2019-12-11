package pl.szymonprz.kotlinconfiguration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinConfigurationApplication

fun main(args: Array<String>) {
	runApplication<KotlinConfigurationApplication>(*args)
}
