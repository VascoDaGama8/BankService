package Finteche.Bank.BankService.config;

import Finteche.Bank.BankService.security.jwt.JwtConfigurer;
import Finteche.Bank.BankService.security.jwt.JwtTokenProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


@Configuration
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final JwtTokenProvider jwtTokenProvider;

    private static final String ADMIN_ENDPOINT = "/bank/admin/**";
    private static final String LOGIN_ENDPOINT = "/bank/login";
    private static final String REGISTER_ENDPOINT = "/bank/register";

    @Autowired
    public SecurityConfig(JwtTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        log.info("Auth");
        return super.authenticationManagerBean();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{

        http.httpBasic().disable().csrf().disable().cors().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().authorizeRequests()
                .antMatchers(LOGIN_ENDPOINT)
                .permitAll().antMatchers(ADMIN_ENDPOINT).hasRole("ADMIN").antMatchers(REGISTER_ENDPOINT).permitAll().anyRequest().authenticated().and().apply(new JwtConfigurer(jwtTokenProvider));
        log.info("http {}",http);
    }
}
