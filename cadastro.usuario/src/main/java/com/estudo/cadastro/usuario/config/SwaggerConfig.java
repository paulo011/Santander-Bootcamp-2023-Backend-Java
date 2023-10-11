package com.estudo.cadastro.usuario.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("casdastro de usuarios - Rest API")
                        .description("Essa api faz parte dos estudos sobre design pattern  do bootcamp da DIO em parceiria com o santander")
                        .version("1.0")
                        .termsOfService("Termo de uso: Open Source")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://github.com/paulo011")
                        )
                ).externalDocs(
                        new ExternalDocumentation()
                                .description("Paulo011")
                                .url("https://github.com/paulo011"));
    }
}
