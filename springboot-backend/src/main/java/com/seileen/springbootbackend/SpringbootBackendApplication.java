package com.seileen.springbootbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.seileen.springbootbackend.model.User;
import com.seileen.springbootbackend.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User ("Mana", "Sama", "manasama@gmail.com"));
		this.userRepository.save(new User ("Gackt", "Kamui", "gackt_kamui69@gmail.com"));
		this.userRepository.save(new User ("Klaha", "Desaparecido", "whereami@gmail.com"));
	}
	
	

}
