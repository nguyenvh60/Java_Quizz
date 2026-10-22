package org.example.model;

import java.util.List;
import java.util.Objects;

public class Quiz {
    private final String title;
    private final List<Question> questions;

    public Quiz(String title, List<Question> questions) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException(
                    "Quiz title cannot be empty");
        }

        Objects.requireNonNull(questions,
                "Questions cannot be null");

        if (questions.isEmpty()) {
            throw new IllegalArgumentException(
                    "Quiz must contain at least one question");
        }

        if (questions.stream().anyMatch(Objects::isNull)) {
            throw new IllegalArgumentException(
                    "Quiz cannot contain null questions");
        }

        this.title = title;
        this.questions = List.copyOf(questions);
    }

    public String getTitle() {
        return title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}
