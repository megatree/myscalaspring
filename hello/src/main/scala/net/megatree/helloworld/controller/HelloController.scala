package net.megatree.helloworld.controller

import java.util.Date

import io.swagger.annotations.{Api, ApiOperation, ApiResponse}
import net.megatree.common.model.Result
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.web.bind.annotation.{PostMapping, RequestMapping, RestController}

/**
  * Created by mythss on 2018-07-29.
  */
@RestController
@RequestMapping(Array("/hello"))
@Api(value = "/hello", tags = Array("测试模块"))
class HelloController {

    private val log: Logger = LoggerFactory.getLogger(classOf[HelloController])

    @ApiOperation(value = "打招呼")
    @PostMapping(Array("/me"))
    def greeting(): Result = {
        val now = new Date
        val content = s"""hello, Now is ${now}"""
        Result(200, "成功", content)
    }
}
