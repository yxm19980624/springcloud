package com.yxm.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: yxm
 * @Date: 2020/12/24 15:16
 * @Emial: yxm1136656235@163.com
 * @Description:
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yxm.springcloud")) //指定提供接口所在的基包
                .build();
    }

    /**
     * 该套 API 说明，包含作者、简介、版本、host、服务URL
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("demo api 说明")
                .contact(new Contact("测试接口","null","yxm1136656235@163.com"))
                .version("0.1")
                .termsOfServiceUrl("localhost:8001/")
                .description("demo api")
                .build();
    }
}
