package com.h2.pruebas.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.speedment.jpastreamer.application.JPAStreamer;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class JPAStreamerConfig {

	private final EntityManagerFactory entityManagerFactory;

    @Bean
    public JPAStreamer jpaStreamer() {
        return JPAStreamer.of(entityManagerFactory);
    }
}
