package com.huike.order

import com.huike.order.startlintener.SpringStartListener
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate

@SpringBootApplication
@EntityScan("com.huike.order.entity")
open class OrderApplication {

    @Bean
    open fun restTemplate(): RestTemplate {
        return RestTemplate()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!")
            val configurableApplicationContext: ConfigurableApplicationContext = SpringApplication.run(OrderApplication::class.java, *args)
            // 向Spring上下文中添加监听器
            configurableApplicationContext.addApplicationListener(SpringStartListener())
        }
    }
}
