package com.theokanning.openai.assistants;

import java.util.Map;

/**
 * @description:
 * @author: vacuity
 * @create: 2023-11-20 10:09
 **/


public class AssistantFunction {

    private String description;
    
    private String name;
    
    private Map<String, Object> parameters;

    public AssistantFunction(String description, String name, Map<String, Object> parameters) {
        this.description = description;
        this.name = name;
        this.parameters = parameters;
    }

    public AssistantFunction() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, Object> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "AssistantFunction{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", parameters=" + parameters +
                '}';
    }

    private AssistantFunction(Builder builder) {
        this.description = builder.description;
        this.name = builder.name;
        this.parameters = builder.parameters;
    }
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String description;

        private String name;

        private Map<String, Object> parameters;

        public Builder description(String description) {
            this.description = description;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder parameters(Map<String, Object> parameters) {
            this.parameters = parameters;
            return this;
        }

        public AssistantFunction build() {
            return new AssistantFunction(this);
        }
    }
}
