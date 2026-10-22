package org.example.model;

public class QuizResult {
    private final int correctAnswers;
    private final int totalQuestions;

    public QuizResult(int correctAnswers, int totalQuestions) {
        if (totalQuestions <= 0
                || correctAnswers < 0
                || correctAnswers > totalQuestions) {
            throw new IllegalArgumentException(
                    "Invalid quiz result");
        }

        this.correctAnswers = correctAnswers;
        this.totalQuestions = totalQuestions;
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getWrongAnswers() {
        return totalQuestions - correctAnswers;
    }

    public double getPercentage() {
        return correctAnswers * 100.0 / totalQuestions;
    }
}
