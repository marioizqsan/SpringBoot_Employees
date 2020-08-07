package tfg.employees.openapiconfiguration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI springEmployeesOpenAPI() {
        return new OpenAPI()
                .components(new Components())
                .info(new Info().title("Employees Application API")
                .description("This is a sample Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
                .version("v0.0.1")
                .license(new License().name("OpenAPI 3 License").url("https://openapis.org")))
                .externalDocs(new ExternalDocumentation()
                        .description("OpenAPI 3 Documentation")
                        .url("https://github.com/OAI/OpenAPI-Specification/"));

    }
}
