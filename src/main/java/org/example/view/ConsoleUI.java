package org.example.view;

import org.example.model.Question;
import org.example.model.Quiz;
import org.example.model.QuizResult;
import org.example.service.QuizService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner;
    private final QuizService quizService;

    public ConsoleUI(Scanner scanner, QuizService quizService) {
        this.scanner = scanner;
        this.quizService = quizService;
    }

    public void start(Quiz quiz) {
        List<Integer> answers = new ArrayList<>();

        System.out.println("================================");
        System.out.println("       JAVA QUIZ - BEGINNER");
        System.out.println("================================");
        System.out.println("Bai thi: " + quiz.getTitle());

        List<Question> questions = quiz.getQuestions();

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);

            System.out.printf(
                    "%nCau %d/%d - [%s]%n%s%n",
                    i + 1,
                    questions.size(),
                    question.getTopic(),
                    question.getContent()
            );

            List<String> options = question.getOptions();

            for (int j = 0; j < options.size(); j++) {
                System.out.printf("%d. %s%n", j + 1, options.get(j));
            }

            int choice = readAnswer(options.size());
            answers.add(choice - 1);

            if (question.isCorrect(choice - 1)) {
                System.out.println("Chinh xac!");
            } else {
                System.out.println("Chua dung!");
                System.out.println(
                        "Dap an dung: "
                                + options.get(
                                question.getCorrectAnswerIndex())
                );
            }

            System.out.println(
                    "Giai thich: " + question.getExplanation());
        }

        QuizResult result = quizService.evaluate(quiz, answers);

        System.out.println("\n========== KET QUA ==========");
        System.out.printf(
                "So cau dung: %d/%d%n",
                result.getCorrectAnswers(),
                result.getTotalQuestions()
        );
        System.out.printf(
                "So cau sai: %d%n",
                result.getWrongAnswers()
        );
        System.out.printf(
                "Ti le chinh xac: %.1f%%%n",
                result.getPercentage()
        );
        System.out.println("=============================");
    }

    private int readAnswer(int optionCount) {
        while (true) {
            System.out.print("Nhap lua chon cua ban: ");
            String input = scanner.nextLine().trim();

            try {
                int choice = Integer.parseInt(input);

                if (choice >= 1 && choice <= optionCount) {
                    return choice;
                }
            } catch (NumberFormatException ignored) {
                // Hien thi thong bao ben duoi.
            }

            System.out.printf(
                    "Vui long nhap so tu 1 den %d.%n",
                    optionCount
            );
        }
    }
}
