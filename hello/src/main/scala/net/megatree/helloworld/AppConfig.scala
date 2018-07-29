package net.megatree.helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.context.annotation.ComponentScan

/**
  * Created by mythss on 2018-07-29.
  */
@ComponentScan(value = Array("net.megatree.helloworld.*"))
@SpringBootApplication(exclude = Array(classOf[DataSourceAutoConfiguration]))
class AppConfig

