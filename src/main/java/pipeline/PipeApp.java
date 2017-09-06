package pipeline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pipeline.Repository.StudentRepository;
import pipeline.entity.Student;

/**
 * Created by Shli on 04/09/2017.
 */
@SpringBootApplication
public class PipeApp {

    public static void main(String[] args) {
        SpringApplication.run(PipeApp.class, args);
    }

    @Autowired
    private StudentRepository repo;

    @Bean
    public ApplicationRunner initDatabase() {
        return args -> {
            repo.save(new Student("yi", 24));
            repo.save(new Student("er", 22));
            repo.save(new Student("san", 23));
            repo.save(new Student("si", 25));
        };
    }
}
