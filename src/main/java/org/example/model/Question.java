package org.example.model;

import java.util.List;
import java.util.Objects;

public class Question {
    private final String content;
    private final List<String> options;
    private final int correctAnswerIndex;
    private final String explanation;
    private final String topic;

    public Question(
            String content,
            List<String> options,
            int correctAnswerIndex,
            String explanation,
            String topic) {

        if (content == null || content.isBlank()) {
            throw new IllegalArgumentException(
                    "Question content cannot be empty");
        }

        Objects.requireNonNull(options, "Options cannot be null");

        if (options.size() < 2
                || options.stream().anyMatch(
                option -> option == null || option.isBlank())) {
            throw new IllegalArgumentException(
                    "At least two valid options are required");
        }

        if (correctAnswerIndex < 0
                || correctAnswerIndex >= options.size()) {
            throw new IllegalArgumentException(
                    "Correct answer index is invalid");
        }

        if (explanation == null || explanation.isBlank()) {
            throw new IllegalArgumentException(
                    "Explanation cannot be empty");
        }

        if (topic == null || topic.isBlank()) {
            throw new IllegalArgumentException(
                    "Topic cannot be empty");
        }

        this.content = content;
        this.options = List.copyOf(options);
        this.correctAnswerIndex = correctAnswerIndex;
        this.explanation = explanation;
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getTopic() {
        return topic;
    }

    public boolean isCorrect(int answerIndex) {
        return answerIndex == correctAnswerIndex;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }
}
