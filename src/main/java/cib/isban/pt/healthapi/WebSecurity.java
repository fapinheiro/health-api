// package cib.isban.pt.healthapi;


// import java.util.Arrays;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.web.cors.CorsConfiguration;
// import org.springframework.web.cors.CorsConfigurationSource;
// import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


// @Configuration
// @EnableWebSecurity
// @EnableGlobalMethodSecurity(prePostEnabled = true)
// public class WebSecurity extends WebSecurityConfigurerAdapter {

	
// 	@Autowired
// 	private UserDetailsService userDetailsService;

// 	@Override
// 	protected void configure(HttpSecurity http) throws Exception {

// 		http.exceptionHandling().and()
// 			.exceptionHandling().and()
// 			.headers().frameOptions().disable().and() // Disable header X-Frame-Options, Sites can use this to avoid clickjacking attacks, by ensuring that their content is not embedded into other sites in an iframe content.
// 			.cors().and().csrf().disable()
// 			// .cors().and().csrf().disable() // Interesting, the attacker makes the client trigger the request he wants to
// 			// .cors().and().csrf().and()
// 			.authorizeRequests()
// 			.antMatchers(HttpMethod.GET, "/api/v1/status").permitAll()
//             .antMatchers(HttpMethod.GET, "/api/actuator/**").permitAll()
// 			.anyRequest().authenticated().and()
// 			.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS); // this disables session creation on Spring Security

// 	}

// 	@Override
// 	public void configure(AuthenticationManagerBuilder auth) throws Exception {
// 		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
// 	}

// 	@Bean
// 	CorsConfigurationSource corsConfigurationSource() {
// 		// Enable default cross-orign from any origin
// 		// Check annotation @CrossOrigin
// 		CorsConfiguration configuration = new CorsConfiguration().applyPermitDefaultValues();
// 		configuration.setAllowCredentials(true);
// 		configuration.setAllowedMethods(
// 			Arrays.asList("GET"));
// 		configuration.setAllowedOrigins(
// 			Arrays.asList("*"));
// 		configuration.setAllowedHeaders(
// 			Arrays.asList("location", "authorization", "content-type", "access-control-request-headers", 
// 				"access-control-request-method", "accept", "origin", "x-requested-with", "remember-me" ));
		
// 		final UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
// 		// source.registerCorsConfiguration("/**", new CorsConfiguration().applyPermitDefaultValues());
// 		source.registerCorsConfiguration("/**", configuration);
// 		return source;
// 	}

// 	@Bean
//     public BCryptPasswordEncoder getPasswordEncoder() {
//         return new BCryptPasswordEncoder();
// 	}
	
// }
