package net.megatree.helloworld.controller

import java.util
import java.util.Date

import org.slf4j.{Logger, LoggerFactory}
import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by mythss on 2018-07-29.
  */
@RestController
@RequestMapping(Array("/hello"))
class HelloController {

    private val log: Logger = LoggerFactory.getLogger(classOf[HelloController])

    @RequestMapping(Array("/me"))
    def greeting() = {
        val now = new Date
        val content = s"""hello, Now is ${now}"""
        val json = new util.HashMap[String, String]
        json.put("content", content)
        log.debug(json.toString)
        json
    }
}
