package br.com.barbero.springbootrest.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/***
 * @author Carlos Barbero
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages="br.com.barbero.springbootrest.repository")
@EntityScan(basePackages="br.com.barbero.springbootrest.beans")
public class Application
{

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}
