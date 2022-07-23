package com.tomspencerlondon.longpolling;

import com.tomspencerlondon.longpolling.hexagon.adapter.FizzBuzzService;
import com.tomspencerlondon.longpolling.hexagon.domain.FizzBuzz;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FizzBuzzConfiguration {

  @Bean
  FizzBuzzService service() {
    return new FizzBuzzService(new FizzBuzz());
  }
}
