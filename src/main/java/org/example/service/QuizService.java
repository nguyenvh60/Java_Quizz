package org.example.service;

import org.example.model.Question;
import org.example.model.Quiz;
import org.example.model.QuizResult;

import java.util.List;
import java.util.Objects;

public class QuizService {
    public QuizResult evaluate(
            Quiz quiz,
            List<Integer> answers) {

        Objects.requireNonNull(quiz, "Quiz cannot be null");
        Objects.requireNonNull(answers, "Answers cannot be null");

        if (answers.size() != quiz.getTotalQuestions()) {
            throw new IllegalArgumentException(
                    "Answer count must match question count");
        }

        int correct = 0;

        for (int i = 0; i < quiz.getTotalQuestions(); i++) {
            Integer answer = answers.get(i);
            Question question = quiz.getQuestions().get(i);

            if (answer != null
                    && answer >= 0
                    && answer < question.getOptions().size()
                    && question.isCorrect(answer)) {
                correct++;
            }
        }

        return new QuizResult(
                correct,
                quiz.getTotalQuestions());
    }
}
