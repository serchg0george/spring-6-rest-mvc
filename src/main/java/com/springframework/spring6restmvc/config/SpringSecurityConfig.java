package com.springframework.spring6restmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Profile("!test")
@Configuration
public class SpringSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authRequest ->
                        authRequest
                                .requestMatchers("/v3/api-docs**","/swagger-ui/**",  "/swagger-ui.html")
                                .permitAll()
                                .anyRequest()
                                .authenticated())
                .oauth2ResourceServer(oAuth ->
                        oAuth.jwt(Customizer.withDefaults()));
        return http.build();
    }
}