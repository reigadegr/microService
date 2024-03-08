package com.huike.product

import com.huike.product.startlintener.SpringStartListener
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.boot.autoconfigure.domain.EntityScan

@SpringBootApplication
@EntityScan("com.huike.product.entity")
open class ProductApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!")
            val configurableApplicationContext: ConfigurableApplicationContext =
                SpringApplication.run(ProductApplication::class.java, *args)

            // 向Spring上下文中添加监听器
            configurableApplicationContext.addApplicationListener(SpringStartListener())
        }
    }
}
