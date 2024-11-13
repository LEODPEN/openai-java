package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request for OpenAi to create transcription based on an audio file
 * All fields except model are optional
 *
 * https://platform.openai.com/docs/api-reference/audio/create
 */

public class CreateTranscriptionRequest {

    /**
     * The name of the model to use.
     */
    String model;

    /**
     * An optional text to guide the model's style or continue a previous audio segment. The prompt should match the audio language.
     */
    String prompt;

    /**
     * The format of the transcript output, in one of these options: json or verbose_json
     */
    @JsonProperty("response_format")
    String responseFormat;

    /**
     * The sampling temperature, between 0 and 1.
     * Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.
     * If set to 0, the model will use log probability to automatically increase the temperature until certain thresholds are hit.
     */
    Double temperature;

    /**
     * The language of the input audio. Supplying the input language in ISO-639-1 format will improve accuracy and latency.
     */
    String language;

    public static CreateTranscriptionRequestBuilder builder() {
        return new CreateTranscriptionRequestBuilder();
    }

    public CreateTranscriptionRequest() {
    }

    public CreateTranscriptionRequest( String model, String prompt, String responseFormat, Double temperature, String language) {
        if (model == null) {
            throw new NullPointerException("model is marked non-null but is null");
        } else {
            this.model = model;
            this.prompt = prompt;
            this.responseFormat = responseFormat;
            this.temperature = temperature;
            this.language = language;
        }
    }

    public String getModel() {
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

    public String getLanguage() {
        return this.language;
    }

    public void setModel(String model) {
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

    public void setLanguage(String language) {
        this.language = language;
    }

    public String toString() {
        return "CreateTranscriptionRequest(model=" + this.getModel() + ", prompt=" + this.getPrompt() + ", responseFormat=" + this.getResponseFormat() + ", temperature=" + this.getTemperature() + ", language=" + this.getLanguage() + ")";
    }

    public static class CreateTranscriptionRequestBuilder {
        private String model;
        private String prompt;
        private String responseFormat;
        private Double temperature;
        private String language;

        CreateTranscriptionRequestBuilder() {
        }

        public CreateTranscriptionRequestBuilder model(String model) {
            if (model == null) {
                throw new NullPointerException("model is marked non-null but is null");
            } else {
                this.model = model;
                return this;
            }
        }

        public CreateTranscriptionRequestBuilder prompt(String prompt) {
            this.prompt = prompt;
            return this;
        }

        @JsonProperty("response_format")
        public CreateTranscriptionRequestBuilder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public CreateTranscriptionRequestBuilder temperature(Double temperature) {
            this.temperature = temperature;
            return this;
        }

        public CreateTranscriptionRequestBuilder language(String language) {
            this.language = language;
            return this;
        }

        public CreateTranscriptionRequest build() {
            return new CreateTranscriptionRequest(this.model, this.prompt, this.responseFormat, this.temperature, this.language);
        }

        public String toString() {
            return "CreateTranscriptionRequest.CreateTranscriptionRequestBuilder(model=" + this.model + ", prompt=" + this.prompt + ", responseFormat=" + this.responseFormat + ", temperature=" + this.temperature + ", language=" + this.language + ")";
        }
    }
}
