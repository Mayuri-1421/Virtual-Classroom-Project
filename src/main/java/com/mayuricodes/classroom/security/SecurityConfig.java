package com.mayuricodes.classroom.security;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/api/classes/**").hasRole("INSTRUCTOR")
            .antMatchers("/api/**").authenticated()
            .and()
            .httpBasic();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
            .withUser("admin").password("{noop}admin123").roles("ADMIN", "INSTRUCTOR")
            .and()
            .withUser("student").password("{noop}student123").roles("STUDENT");
    }
}
