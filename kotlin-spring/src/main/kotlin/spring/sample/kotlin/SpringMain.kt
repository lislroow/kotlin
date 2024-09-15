package spring.sample.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SpringMain

fun main(args: Array<String>) {
  runApplication<SpringMain>(*args)
}
