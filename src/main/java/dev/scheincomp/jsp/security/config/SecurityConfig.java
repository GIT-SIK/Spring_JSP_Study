package dev.scheincomp.jsp.security.config;

        import org.springframework.context.annotation.Configuration;
        import org.springframework.security.config.annotation.web.builders.HttpSecurity;
        import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
        import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
        import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {



    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.cors().disable();
        http.sessionManagement() // 세션관리
                .maximumSessions(1)
                .maxSessionsPreventsLogin(true); // 동시로그인 방지 / false -> 세션만료

        http.authorizeRequests()
                .antMatchers("/**").permitAll() // 접근 가능 설정
                .anyRequest().authenticated() // '/' 제외한 모든 경로 인증필수
                .and()
                .formLogin() // 인증필요시 로그인폼 ( 기본 시큐리티 폼 )
                .and()
                .logout().invalidateHttpSession(true).deleteCookies("JSESSIONID"); // 쿠키 삭제
    }


    // Encode
    /*
    @Bean
    public  BCryptPasswordEncoder encode(){
        return new BCryptPasswordEncoder();
    }

     */
}