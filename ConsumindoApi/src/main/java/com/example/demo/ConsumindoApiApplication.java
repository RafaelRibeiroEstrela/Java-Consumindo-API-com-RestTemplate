package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Pessoa;

@SpringBootApplication
public class ConsumindoApiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ConsumindoApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Permite consumir API
		RestTemplate restTemplate = new RestTemplate();
		
		//Permite ao RestTemplante reconhecer o tipo consumido
		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
		
		Pessoa pessoa = restTemplate.getForObject("http://127.0.0.1:5000/", Pessoa.class);
		
		System.out.println(pessoa);
		
		System.out.println(pessoa.getNumeros().getClass());
		
	}

}
