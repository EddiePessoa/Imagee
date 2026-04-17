package com.imageapi.imageapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.imageapi.imageapi.domain.entity.Image;
import com.imageapi.imageapi.domain.enums.ImageExtension;
import com.imageapi.imageapi.info.repository.ImageRepository;


@SpringBootApplication
@EnableJpaAuditing
public class ImageapiApplication {


	@Bean
	public CommandLineRunner commandLineRunner(@Autowired ImageRepository repository){
		return args -> {
			Image image = Image
					.builder()
					.extension(ImageExtension.JPEG)
					.name("myimage")
					.tags("teste")
					.size(1000L)
					.build();
			repository.save(image);
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(ImageapiApplication.class, args);
	}

}
