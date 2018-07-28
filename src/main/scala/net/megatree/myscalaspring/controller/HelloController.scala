package net.megatree.myscalaspring.controller

import java.util
import java.util.Date

import org.springframework.web.bind.annotation.{RequestMapping, RestController}

/**
  * Created by mythss on 2018-07-29.
  */
@RestController
@RequestMapping(Array("/hello"))
class HelloController {

  @RequestMapping(Array("/me"))
  def greeting() = {
    val now = new Date
    val content = """hello, Now is ${now} """
    val json = new util.HashMap[String, String]
    json.put("content", content)
    json
  }
}
