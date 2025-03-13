package ru.fiarr4ikdev.componentaccountingapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI initOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Component Accounting API")
                        .version("1.0")
                        .description("Spring boot REST API")
                        .contact(new Contact()
                                .name("Fiarr4ikDev")
                                .email("fiarr4ik@gmail.com")
                                .url("https://github.com/Fiarr4ikDev/component-accounting-api")));
    }

}
