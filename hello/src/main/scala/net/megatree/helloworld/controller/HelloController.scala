package net.megatree.helloworld.controller

import java.util.Date

import io.swagger.annotations.{Api, ApiOperation}
import net.megatree.common.model.Result
import net.megatree.helloworld.service.HelloService
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestMapping, RestController}

/**
  * Created by mythss on 2018-07-29.
  */
@RestController
@RequestMapping(Array("/hello"))
@Api(value = "/hello", tags = Array("测试模块"))
class HelloController {

    private val log: Logger = LoggerFactory.getLogger(classOf[HelloController])

    @Autowired
    private val helloService: HelloService = null

    @ApiOperation(value = "打招呼")
    @GetMapping(Array("/me"))
    def greeting(p: String): Result = {
        log.debug(s"""hello, Now is ${new Date}""")
        Result(200, "成功", helloService.getData(p))
    }
}
