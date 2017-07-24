package io.javabrains.springbootstart.ed2.main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by etischler on 7/24/2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = "io.javabrains.springbootstart.ed2")
public class CourseApiApp {

    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class,args);
    }

}
