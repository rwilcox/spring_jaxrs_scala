package example

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.{EnableAutoConfiguration, SpringBootApplication}
import org.springframework.context.annotation.{ComponentScan, Configuration}

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
class ScalaSpringApplication

object Main {
  def main( args : Array[String] ): Unit = {
    SpringApplication.run(classOf[ScalaSpringApplication], args: _*)
  }
}
