package utez.edu.mx.sigev.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configurerGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests((requests)->{
            requests.requestMatchers("/","/Login", "/admin/*", "/category/*", "/enlaces/*", "/municipios/*").permitAll();
            requests.requestMatchers("/colonias/*", "/comite/*", "/incidencia/*").permitAll();
            requests.anyRequest().permitAll();
        });

        http.formLogin((login)->{
            login.loginPage("/index.html").permitAll();
        });

        http.logout((logout)->{
            logout.permitAll();
        });

        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("rodo")
                .password("12345")
                .roles("admin")
                .build();
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("fabi")
                .password("6789")
                .roles("admin")
                .build();
        return new InMemoryUserDetailsManager(user, user1);
    }
}
