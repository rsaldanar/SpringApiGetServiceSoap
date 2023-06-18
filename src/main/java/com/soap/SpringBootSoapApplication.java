package com.soap;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootSoapApplication {

//	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootSoapApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapApplication.class, args);
	}

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("*** Docs  ***")
						.version("V0.0.1")
						.description("Estas es una Api-Rest Spring Boot con Swagger que consume un servicio SOAP")
						.termsOfService("http://swagger.io/terms/")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

//	@Bean
//	CommandLineRunner init(SoapClient soapClient) {
//		return args -> {
//			AddResponse response = soapClient.getAddResonse(2, 2);
//			LOGGER.info("El restualtado de la suma de los numeros {} y {} es : {} ", 2 ,2, response.getAddResult());
//		};
//	}

}
