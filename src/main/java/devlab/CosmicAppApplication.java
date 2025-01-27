package devlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*
*
* @SpringBootApplication <- @Configuration @EnableAutoConfiguration @ComponentScan
*
*
* */

@PropertySource("classpath:config.properties")
@SpringBootApplication
public class CosmicAppApplication {

    /*
    *
    *  Statyczna metoda, która uruchamia statyczną metodę 'run'klasy SpringApplication.
    *  Jako parametr przyjmuje naszą klasę uruchomieniową.
    *
    * */

    public static void main(String[] args) {
        SpringApplication.run(CosmicAppApplication.class, args);
    }

    @Bean
    PasswordEncoder getPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
