package br.com.alura.screenmatch;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.service.ConsumoAPI;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var ConsumoAPI = new ConsumoAPI();
		var json = ConsumoAPI.obterDados("http://www.omdbapi.com/?apikey=70c8bcd5&t=Gilmore+Girls");
		System.out.println(json);
	}

}
