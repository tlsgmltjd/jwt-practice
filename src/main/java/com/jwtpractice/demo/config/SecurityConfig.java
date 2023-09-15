package com.jwtpractice.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity // 기본적인 Web 보인을 활성화 하겠다.
public class SecurityConfig {
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests() // HttpServletRequest를 사용하는 요청들에 대한 접근제합을 설정하겠다
                .requestMatchers("/api/hello").permitAll() // /api/hello에 대한 요청은 인증 없이 접근 허용
                .anyRequest().authenticated(); // 나머지 요청들은 모두 인증이 필요하다.

        return http.build();
    }
}
