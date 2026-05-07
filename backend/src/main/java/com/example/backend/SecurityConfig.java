// defines what's public and what's protected

package com.example.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; 
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(s -> s.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                // public endpoints
                .requestMatchers(HttpMethod.GET, "/person").permitAll()
                .requestMatchers(HttpMethod.GET, "/projects").permitAll()
                .requestMatchers(HttpMethod.GET, "/projects/**").permitAll()
                .requestMatchers(HttpMethod.GET, "/interests").permitAll()
                .requestMatchers(HttpMethod.GET, "/goals").permitAll()
                .requestMatchers(HttpMethod.GET, "/goals/**").permitAll()
                // H2 console (dev only)
                .requestMatchers("/h2-console/**").permitAll()
                // login
                .requestMatchers("/auth/login").permitAll()
                // everything else requires a token
                .anyRequest().authenticated()
            )
            .headers(h -> h.frameOptions(f -> f.disable())) // needed for H2 console
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}