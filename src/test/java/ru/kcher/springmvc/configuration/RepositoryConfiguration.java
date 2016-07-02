package ru.kcher.springmvc.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"ru.kcher.springmvc.model"})
@EnableJpaRepositories(basePackages = {"ru.kcher.springmvc.repository"})
public class RepositoryConfiguration {
}
