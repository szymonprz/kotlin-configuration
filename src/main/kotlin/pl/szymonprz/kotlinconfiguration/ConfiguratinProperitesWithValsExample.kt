package pl.szymonprz.kotlinconfiguration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
@EnableConfigurationProperties(LoadedConfiguration::class)
class ConfiguratinProperitesWithValsExample {

    @Bean
    fun someBean(loadedConfiguration: LoadedConfiguration): SomeBean {
        return SomeBean(loadedConfiguration.name, loadedConfiguration.options)
    }
}

@ConstructorBinding
@ConfigurationProperties(prefix = "configuration")
data class LoadedConfiguration(val timeout: Int, val name: String, val options: List<String>)

class SomeBean(name: String, options: List<String>)