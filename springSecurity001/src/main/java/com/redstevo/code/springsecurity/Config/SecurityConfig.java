package com.redstevo.code.springsecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfig {
    @Bean
    public UserDetailsService userDetailsService()
    {
        var udl = new InMemoryUserDetailsManager();

        var user1 = User.withUsername("steve")
                .password("sijui")
                .authorities("read")
                .build();
        udl.createUser(user1);
        return udl;
    }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        System.out.println("Configured the password encoder.");
        return NoOpPasswordEncoder.getInstance();
    }
}
