package com.matthew;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matthew.model.User;
import com.matthew.repository.UserRepository;

@SpringBootApplication
public class ApplicationDriver {

	@Bean
	public String setup(UserRepository userRepository) {
		userRepository.save(new User("Ed", "Harris", "Male","November 28, 1950","USA", "Actor"));
		userRepository.save(new User("Harvey", "Weinstein", "Male","March 19, 1952","USA", "Producer"));
		userRepository.save(new User("Kevin", "Spacey", "Male" ,"July 26, 1959" ,"USA", "Actor"));
		userRepository.save(new User("Jude", "Law", "Male" ,"December 29, 1972" ,"UK", "Actor"));
		userRepository.save(new User("Emma", "Watson", "Female" ,"April 15, 1990" ,"France", "Actress"));
		
		userRepository.save(new User("Robert", "De Niro", "Male","August 17, 1943","USA", "Actor"));
		userRepository.save(new User("Jack", "Nicholson", "Male","April 22, 1937","USA", "Actor"));
		userRepository.save(new User("Tom", "Hanks", "Male" ,"July 9, 1956" ,"USA", "Actor"));
		userRepository.save(new User("Marlon", "Brando", "Male" ,"April 3, 1924" ,"USA", "Actor"));
		userRepository.save(new User("Leonardo", "DiCaprio", "Male" ,"November 11, 1974" ,"USA", "Actor"));
		
		userRepository.save(new User("Johnny", "Depp", "Male","June 9, 1963","USA", "Actor"));
		userRepository.save(new User("Al", "Pacino", "Male","April 25, 1940","USA", "Actor"));
		userRepository.save(new User("Denzel", "Washington", "Male" ,"December 28, 1954" ,"USA", "Actor"));
		userRepository.save(new User("Brad", "Pitt", "Male" ,"December 18, 1963" ,"USA", "Actor"));
		userRepository.save(new User("Morgan", "Freeman", "Male" ,"June 1, 1937" ,"USA", "Actor"));
		
		userRepository.save(new User("Jennifer", "Lawrence", "Female","August 15, 1990","USA", "Actress"));
		userRepository.save(new User("Kate", "Winslet", "Female","October 5, 1975","UK", "Actress"));
		userRepository.save(new User("Viola", "Davis", "Female" ,"August 11, 1965" ,"USA", "Actress"));
		userRepository.save(new User("Judi", "Dench", "Female" ,"December 9, 1934" ,"UK", "Actress"));
		userRepository.save(new User("Matt", "Damon", "Male" ,"October 8, 1970" ,"USA", "Actor"));
		logger.info("Real data has been created");
		return "Done";
	}
	
	private static final Logger logger = LoggerFactory.getLogger(ApplicationDriver.class);

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDriver.class, args);
	}
}