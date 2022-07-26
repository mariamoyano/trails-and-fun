package com.ironhack.edgeservice.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.httpBasic();
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/login").authenticated()
//                .antMatchers(HttpMethod.DELETE, "/trail/**","/place/**","/event/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.POST, "/trail/**","/place/**","/event/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.PUT, "/trail/**","/place/**","/event/**").hasRole("ADMIN")
//                .antMatchers(HttpMethod.GET, "/trail/**","/place/**","/event/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/events","/event/**","/events/**","/trails", "/trail/**","/trails/**",
//                        "/places","/place/**","/places/**", "/login").authenticated()
//                .antMatchers(HttpMethod.POST, "/event/add/**","trail/add/**","place/add/**").authenticated()
                .anyRequest().permitAll();
        return http.build();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}
