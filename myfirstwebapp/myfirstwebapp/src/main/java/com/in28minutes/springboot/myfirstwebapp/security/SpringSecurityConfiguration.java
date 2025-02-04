package com.in28minutes.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
    
    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        
        Function<String, String> passwordEncoder = password -> passwordEncoder().encode(password);

        UserDetails userDetails = User.builder()
            .username("in28minutes")
            .password(passwordEncoder.apply("dummy")) // Corrected encoding call
            .roles("USER", "ADMIN")
            .build();

        return new InMemoryUserDetailsManager(userDetails);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
