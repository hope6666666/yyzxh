package com.cqupt.yyzx.config;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 //开启Swagger2的自动配置
public class Swagger2Config {
    /**
     * swagger会帮助我们生成接口文档
     * 1.配置生成的文档信息：比如文档名称、作者、版本号等
     * 2.配置生成规则
     */
    //Docket封装接口文档信息
    @Bean
    public Docket getDocket() {
        //创建封面信息对象
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("《颐养中心》后端接口文档")//文档标题
                .description("颐养中心后端接口文档说明")//文档描述
                .version("v1.0")//版本号
                .contact(new Contact("XXX","XXX","ABC@qq.com"));//联系人
        ApiInfo apiInfo = apiInfoBuilder.build();

        //DocumentationType.SWAGGER_2 ：指定生成的是Swagger 2规范的文档风格
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)  //指定生成的文档中的封面信息：文档标题、版本、作者
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cqupt.yyzx.controller")) //为指定包处理器方法生成接口文档
                .paths(PathSelectors.any())
                .build();
        return docket;

    }

}
