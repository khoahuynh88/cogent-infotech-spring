package cogent.infotech.com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import cogent.infotech.com.service.CustomUserDetailsService;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	 @Autowired
	    private CustomUserDetailsService userDetailsService;
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailsService);
	    }
	    @Bean
	    public PasswordEncoder passwordEncoder(){
	        return NoOpPasswordEncoder.getInstance();
	    }
	    
		
		/*
		 * @Override protected void configure(HttpSecurity http) throws Exception {
		 * http.csrf().disable() .authorizeRequests() .antMatchers("/h2**",
		 * "/api/book/**") .permitAll() .anyRequest() .authenticated()
		 * .and().formLogin() .loginPage("/login**") .permitAll(); }
		 */
		 
		
		@Override
		public void configure(WebSecurity web) throws Exception {
			web.ignoring().antMatchers("/h2/**");
			web.ignoring().antMatchers("/api/book/**");

		}
		 
}
