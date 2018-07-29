package net.megatree.helloworld.config

import org.slf4j.{Logger, LoggerFactory}
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.{Bean, Configuration, Scope}
import springfox.documentation.builders.{ApiInfoBuilder, PathSelectors, RequestHandlerSelectors}
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
  * Created by mythss on 2018-07-29.
  */
@EnableSwagger2
@Configuration
class SwaggerConfig {

    @Value("${swagger.ui.enable}")
    val UI_ENABLE: Boolean = false

    private val log: Logger = LoggerFactory.getLogger(classOf[SwaggerConfig])

    @Bean
    @Scope("singleton")
    def userDocketFactory: Docket = {
        val docket = new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo)
            .groupName("default Group")
            .select()
            .apis(RequestHandlerSelectors.basePackage("net.megatree.helloworld.controller"))
            .paths(PathSelectors.any())
            .build()
            .useDefaultResponseMessages(false)
        docket.enable(UI_ENABLE)
    }

    def apiInfo: ApiInfo = {
        new ApiInfoBuilder()
            .title("SpringBoot with Scala API")
            .description("关于scala和spring boot2.0的入门项目")
            .license("Apache License, Version 2.0")
            .version("1.0")
            .build()
    }
}
