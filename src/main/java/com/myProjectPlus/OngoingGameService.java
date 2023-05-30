package com.myProjectPlus;

import com.myProjectPlus.services.QuizDataService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.myProjectPlus.dto.QuestionsDto;
import com.myProjectPlus.frontend.GameOptions;

import java.util.List;

@Service
@Log
public class OngoingGameService {
    private GameOptions gameOptions;
    private int currentQuestionIndex;
    private int points;

    private List<QuestionsDto.QuestionDto> questions;

    @Autowired
    private QuizDataService quizDataService;

    public void init(GameOptions gameOptions) {
        this.gameOptions = gameOptions;
        this.currentQuestionIndex = 0;
        this.points = 0;

        quizDataService.getQuizQuestions();
    }
}
