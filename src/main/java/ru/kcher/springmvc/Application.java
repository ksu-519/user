package ru.kcher.springmvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.kcher.springmvc.model.User;
import ru.kcher.springmvc.repository.UserRepository;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    @Bean
    CommandLineRunner init(UserRepository userRepository) {
        return (evt) -> {
            User user = new User("Sam", "NY", "", "", 18);
            userRepository.save(user);
            user = new User("Tomy", "ALBAMA", "", "", 18 );
            userRepository.save(user);
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}