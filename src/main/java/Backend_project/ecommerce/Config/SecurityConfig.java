package Backend_project.ecommerce.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Disabling CSRF for easier testing with tools like Postman
                .csrf(csrf -> csrf.disable())
                // Allowing all requests for now to focus on backend development
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                )
                // Disabling frame options to allow H2 console or similar tools if needed
                .headers(headers -> headers.frameOptions(frame -> frame.disable()));

        return http.build();
    }
}