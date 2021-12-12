package cn.newbeedaly.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "cn.newbeedaly")
@SpringBootApplication
public class OneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneApplication.class, args);
    }

}
