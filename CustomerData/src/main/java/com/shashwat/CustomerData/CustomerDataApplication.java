package com.shashwat.CustomerData;

import com.shashwat.CustomerData.models.User;
import com.shashwat.CustomerData.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerDataApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public CustomerDataApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CustomerDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(userRepository.findAll().isEmpty()) {
			userRepository.save(new User("Shashwat", "Sharma"));
			userRepository.save(new User("Viraj", "Bhagat"));
			userRepository.save(new User("Ved","Raut"));
			userRepository.save(new User("Pranav","Tambaku"));
			userRepository.save(new User("Pranay","Tambaku"));
		}

		for(User user : userRepository.findAll()) {
			System.out.println(user);
		}
	}
}
