package net.megatree.common.model

import io.swagger.annotations.{ApiModel, ApiModelProperty}

/**
  * Created by mythss on 2018-07-30.
  */
case class Result(@ApiModelProperty("状态码") code: Int,
                  @ApiModelProperty("信息") msg: String,
                  @ApiModelProperty("信息") data: Any)
