package org.example;

import org.example.model.Question;
import org.example.model.Quiz;
import org.example.service.QuizService;
import org.example.view.ConsoleUI;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Question> questions = List.of(
                new Question(
                        "Kieu du lieu nao dung de luu so nguyen?",
                        List.of("String", "int", "boolean", "char"),
                        1,
                        "int la kieu du lieu nguyen thuy dung de luu so nguyen.",
                        "Bien va kieu du lieu"
                ),
                new Question(
                        "Ket qua cua bieu thuc 5 > 3 la gi?",
                        List.of("5", "3", "true", "false"),
                        2,
                        "5 lon hon 3 nen bieu thuc tra ve true.",
                        "Toan tu"
                ),
                new Question(
                        "Tu khoa nao dung de tao doi tuong?",
                        List.of("class", "new", "void", "static"),
                        1,
                        "Tu khoa new duoc dung de tao doi tuong trong Java.",
                        "OOP"
                ),
                new Question(
                        "Tu khoa nao the hien tinh truu tuong",
                        List.of("abstract","void","for","int"),
                        0,
                        "Tu khoa abstract duoc dung de truu tuong",
                        "OOP"
                )
        );

        Quiz quiz = new Quiz(
                "Java Fundamentals - Beginner",
                questions
        );

        QuizService quizService = new QuizService();

        try (Scanner scanner = new Scanner(System.in)) {
            ConsoleUI ui = new ConsoleUI(scanner, quizService);
            ui.start(quiz);
        }
    }
    }

