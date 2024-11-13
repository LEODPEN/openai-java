package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

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
    @NonNull
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

    public CreateTranscriptionRequest(@NonNull String model, String prompt, String responseFormat, Double temperature, String language) {
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

    public String getLanguage() {
        return this.language;
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

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof CreateTranscriptionRequest)) {
            return false;
        } else {
            CreateTranscriptionRequest other = (CreateTranscriptionRequest)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label71: {
                    Object this$temperature = this.getTemperature();
                    Object other$temperature = other.getTemperature();
                    if (this$temperature == null) {
                        if (other$temperature == null) {
                            break label71;
                        }
                    } else if (this$temperature.equals(other$temperature)) {
                        break label71;
                    }

                    return false;
                }

                Object this$model = this.getModel();
                Object other$model = other.getModel();
                if (this$model == null) {
                    if (other$model != null) {
                        return false;
                    }
                } else if (!this$model.equals(other$model)) {
                    return false;
                }

                label57: {
                    Object this$prompt = this.getPrompt();
                    Object other$prompt = other.getPrompt();
                    if (this$prompt == null) {
                        if (other$prompt == null) {
                            break label57;
                        }
                    } else if (this$prompt.equals(other$prompt)) {
                        break label57;
                    }

                    return false;
                }

                Object this$responseFormat = this.getResponseFormat();
                Object other$responseFormat = other.getResponseFormat();
                if (this$responseFormat == null) {
                    if (other$responseFormat != null) {
                        return false;
                    }
                } else if (!this$responseFormat.equals(other$responseFormat)) {
                    return false;
                }

                Object this$language = this.getLanguage();
                Object other$language = other.getLanguage();
                if (this$language == null) {
                    if (other$language == null) {
                        return true;
                    }
                } else if (this$language.equals(other$language)) {
                    return true;
                }

                return false;
            }
        }
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

        public CreateTranscriptionRequestBuilder model(@NonNull String model) {
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
