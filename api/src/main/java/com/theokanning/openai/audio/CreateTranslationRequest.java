package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

/**
 * A request for OpenAi to create English translation based on an audio file
 * All fields except model are optional
 *
 * https://platform.openai.com/docs/api-reference/audio/create
 */
public class CreateTranslationRequest {

    /**
     * The name of the model to use.
     */
    @NonNull
    String model;

    /**
     * An optional text to guide the model's style or continue a previous audio segment. The prompt should be in English.
     */
    String prompt;

    /**
     * The format of the translated output, in one of these options: json or verbose_json
     */
    @JsonProperty("response_format")
    String responseFormat;

    /**
     * The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * If set to 0, the model will use log probability to automatically increase the temperature until certain thresholds are hit.
     */
    Double temperature;

    public static CreateTranslationRequestBuilder builder() {
        return new CreateTranslationRequestBuilder();
    }

    public CreateTranslationRequest() {
    }

    public CreateTranslationRequest(@NonNull String model, String prompt, String responseFormat, Double temperature) {
        if (model == null) {
            throw new NullPointerException("model is marked non-null but is null");
        } else {
            this.model = model;
            this.prompt = prompt;
            this.responseFormat = responseFormat;
            this.temperature = temperature;
        }
    }

    public @NonNull String getModel() {
        return this.model;
    }

    public String getPrompt() {
        return this.prompt;
    }

    public String getResponseFormat() {
        return this.responseFormat;
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public void setModel(@NonNull String model) {
        if (model == null) {
            throw new NullPointerException("model is marked non-null but is null");
        } else {
            this.model = model;
        }
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @JsonProperty("response_format")
    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return "CreateTranslationRequest(model=" + this.getModel() + ", prompt=" + this.getPrompt() + ", responseFormat=" + this.getResponseFormat() + ", temperature=" + this.getTemperature() + ")";
    }

    public static class CreateTranslationRequestBuilder {
        private String model;
        private String prompt;
        private String responseFormat;
        private Double temperature;

        CreateTranslationRequestBuilder() {
        }

        public CreateTranslationRequestBuilder model(@NonNull String model) {
            if (model == null) {
                throw new NullPointerException("model is marked non-null but is null");
            } else {
                this.model = model;
                return this;
            }
        }

        public CreateTranslationRequestBuilder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        @JsonProperty("response_format")
        public CreateTranslationRequestBuilder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public CreateTranslationRequestBuilder temperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }

        public CreateTranslationRequest build() {
            return new CreateTranslationRequest(this.model, this.prompt, this.responseFormat, this.temperature);
        }

        public String toString() {
            return "CreateTranslationRequest.CreateTranslationRequestBuilder(model=" + this.model + ", prompt=" + this.prompt + ", responseFormat=" + this.responseFormat + ", temperature=" + this.temperature + ")";
        }
    }
}
