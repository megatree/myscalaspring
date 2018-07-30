package net.megatree.helloworld.service

import net.megatree.helloworld.controller.HelloController
import net.megatree.helloworld.vo.GreetoVO
import org.slf4j.{Logger, LoggerFactory}
import org.springframework.stereotype.Service

/**
  * Created by wangzhe.bj on 2018-07-30.
  */
@Service
class HelloService {

    private val log: Logger = LoggerFactory.getLogger(classOf[HelloController])

    def getData(param: String): GreetoVO = {
        GreetoVO(10, s"这是一条问候,${param}")
    }


}
