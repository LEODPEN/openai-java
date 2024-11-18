package com.theokanning.openai.moderation;

import java.util.List;

/**
 * An object containing a response from the moderation api
 *
 * https://beta.openai.com/docs/api-reference/moderations/create
 */
public class ModerationResult {
    /**
     * A unique id assigned to this moderation.
     */
    public String id;

    /**
     * The model used.
     */
    public String model;

    /**
     * A list of moderation scores.
     */
    public List<Moderation> results;

    public ModerationResult(String id, String model, List<Moderation> results) {
        this.id = id;
        this.model = model;
        this.results = results;
    }

    public ModerationResult() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Moderation> getResults() {
        return results;
    }

    public void setResults(List<Moderation> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ModerationResult{" +
                "id='" + id + '\'' +
                ", model='" + model + '\'' +
                ", results=" + results +
                '}';
    }
}
