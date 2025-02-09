package com.example.pharmacymanagementsystem.main;
import com.example.pharmacymanagementsystem.util.DatabaseConnection;
import jdk.jfr.Enabled;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.orm.jpa.*;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.pharmacymanagementsystem.repositories")
@EntityScan("com.example.pharmacymanagementsystem.models")
public class Main {
public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
    //DatabaseConnection.getConnection();
    //DatabaseConnection.closeConnection();
}
}
