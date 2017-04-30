package com.basic.HandlingCollections;

import java.util.List;

/**
 * Created by svmga on 04-Apr-17.
 */
public class Question {
    private String description;
    private List<String> options;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "description='" + description + '\'' +
                ", options=" + options +
                '}';
    }
}
