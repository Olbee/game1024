package sk.tuke.gamestudio;

import sk.tuke.gamestudio.consoleui.ConsoleUI;
import sk.tuke.gamestudio.core.Field;

import sk.tuke.gamestudio.service.score.ScoreService;

import sk.tuke.gamestudio.service.score.ScoreServiceJPA;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@SpringBootApplication
@Configuration
public class SpringClient {
    public static void main(String[] args) {
        SpringApplication.run(SpringClient.class);
    }

    @Bean
    public CommandLineRunner runner(ConsoleUI ui) {
        //return args -> ui.playGame();
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                ui.playGame();
            }
        };
    }

    @Bean
    public ConsoleUI consoleui() throws IOException {
        return new ConsoleUI();
    }

    @Bean
    public Field field() {
        return new Field(4, 4);
    }

    @Bean
    public ScoreService scoreService() {
        //return new ScoreServiceJDBC();
        return new ScoreServiceJPA();
    }

}
