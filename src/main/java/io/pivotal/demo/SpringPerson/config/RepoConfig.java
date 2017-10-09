package io.pivotal.demo.SpringPerson.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.data.repository.init.Jackson2RepositoryPopulatorFactoryBean;

@Configuration
@EnableRedisRepositories
public class RepoConfig {
	  @Bean
	  public Jackson2RepositoryPopulatorFactoryBean repositoryPopulator() {

	    Resource sourceData = new ClassPathResource("persons.json");

	    Jackson2RepositoryPopulatorFactoryBean factory = new Jackson2RepositoryPopulatorFactoryBean();
	    // Set a custom ObjectMapper if Jackson customization is needed
	    factory.setResources(new Resource[] { sourceData });
	    return factory;
	  }
}