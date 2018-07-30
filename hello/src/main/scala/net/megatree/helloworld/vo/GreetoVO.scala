package net.megatree.helloworld.vo

import scala.beans.BeanProperty

/**
  * Created by wangzhe.bj on 2018-07-30.
  */
case class GreetoVO(@BeanProperty id: Int,
                    @BeanProperty banner: String)
