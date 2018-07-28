package net.megatree.myscalaspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration

/**
  * Created by mythss on 2018-07-29.
  */
@SpringBootApplication(exclude = Array(classOf[DataSourceAutoConfiguration]))
class AppConfig

