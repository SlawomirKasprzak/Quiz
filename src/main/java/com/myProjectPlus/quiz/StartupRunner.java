package com.myProjectPlus.quiz;

import com.myProjectPlus.database.entities.PlayerEntity;
import com.myProjectPlus.database.repositories.PlayerRepository;
import com.myProjectPlus.services.QuizDataService;
import lombok.extern.java.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Log
public class StartupRunner implements CommandLineRunner {

    @Autowired
    private QuizDataService quizDataService;

    @Override
    public void run(String...args) throws Exception {
        log.info("Executing startup actions...");
        quizDataService.getQuizCategories();


//        log.info("List of players from database:");
//        List<PlayerEntity> playersFromDatabase = quizDataService.findAll();
//        for (PlayerEntity player : playersFromDatabase) {
//            log.info("Retrieved player: " + player);
//        }

    }
}
