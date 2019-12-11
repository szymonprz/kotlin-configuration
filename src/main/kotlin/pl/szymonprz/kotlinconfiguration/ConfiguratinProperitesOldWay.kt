package pl.szymonprz.kotlinconfiguration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import kotlin.properties.Delegates


@Configuration
@EnableConfigurationProperties(OldConfiguration::class)
class ConfiguratinProperitesOldWay {

    @Bean
    fun otherBean(oldConfiguration: OldConfiguration): OtherBean {
        return OtherBean(oldConfiguration.name, oldConfiguration.options)
    }
}

@ConfigurationProperties(prefix = "old-configuration")
class OldConfiguration {
    var timeout by Delegates.notNull<Long>()
    lateinit var name: String
    var options: List<String> = emptyList()
}

class OtherBean(name: String, options: List<String>)