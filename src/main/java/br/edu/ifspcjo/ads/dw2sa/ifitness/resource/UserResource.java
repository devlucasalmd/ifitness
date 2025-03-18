package br.edu.ifspcjo.ads.dw2sa.ifitness.resource;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.dw2sa.ifitness.domain.model.*;

@RestController
public class UserResource {
	
	@GetMapping("/users")
	public List<User> listar(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("Fernando Duarte");
		user1.setEmail("fernandoduarte@ifsp.edu.br");
		user1.setPassword("dw2s6");
		user1.setDateOfBirth(LocalDate.of(1975, 11, 16));
		user1.setGender(Gender.MASCULINO);
		
		var user2 = new User();
		user2.setId(2L);
		user2.setName("Gislaine Rosales");
		user2.setEmail("gislaine@ifsp.edu.br");
		user2.setPassword("coord");
		user2.setDateOfBirth(LocalDate.of(1980, 1, 1));
		user2.setGender(Gender.FEMININO);
		
		return Arrays.asList(user1, user2);	
	}

}
