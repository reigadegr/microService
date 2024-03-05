package com.huike.product

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan

@SpringBootApplication
@EntityScan("com.huike.product.entity")
open class ApplicationStarter {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello world!")
            SpringApplication.run(ApplicationStarter::class.java, *args)
        }
    }
}
