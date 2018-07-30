package net.megatree.common.model

import scala.beans.BeanProperty

/**
  * Created by mythss on 2018-07-30.
  */
case class Result(@BeanProperty code: Int,
                  @BeanProperty msg: String,
                  @BeanProperty data: Any)
