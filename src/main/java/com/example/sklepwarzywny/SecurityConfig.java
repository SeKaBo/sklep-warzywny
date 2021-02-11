package com.example.sklepwarzywny;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig<MyBasicAuthenticationEntryPoint> extends WebSecurityConfigurerAdapter {

//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("user")
            .password("{noop}password")
            .roles("USER");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
//                .antMatchers("/**").hasAnyRole("USER")

                .antMatchers("/registration", "/")
                .permitAll()
//                .antMatchers("/testdb", "/")
//                .permitAll()
                .antMatchers("/products")
                .hasAnyRole("USER")
                .antMatchers("/cart")
                .hasAnyRole("USER")
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll();

        http.headers()
            .frameOptions()
            .disable();


    }
}