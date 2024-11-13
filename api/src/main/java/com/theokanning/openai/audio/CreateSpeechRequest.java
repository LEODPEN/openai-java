package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateSpeechRequest {

    /**
     * The name of the model to use.
     */
    String model;

    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     */
    String input;

    /**
     * The voice to use when generating the audio.
     */
    String voice;

    /**
     * The format to audio in. Supported formats are mp3, opus, aac, and flac. Defaults to mp3.
     */
    @JsonProperty("response_format")
    String responseFormat;

    /**
     * The speed of the generated audio. Select a value from 0.25 to 4.0. Defaults to 1.0.
     */
    Double speed;

    public static CreateSpeechRequestBuilder builder() {
        return new CreateSpeechRequestBuilder();
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public CreateSpeechRequest(String model, String input, String voice, String responseFormat, Double speed) {
        this.model = model;
        this.input = input;
        this.voice = voice;
        this.responseFormat = responseFormat;
        this.speed = speed;
    }

    public CreateSpeechRequest() {
    }

    @Override
    public String toString() {
        return "CreateSpeechRequest{" +
                "model='" + model + '\'' +
                ", input='" + input + '\'' +
                ", voice='" + voice + '\'' +
                ", responseFormat='" + responseFormat + '\'' +
                ", speed=" + speed +
                '}';
    }


    public static class CreateSpeechRequestBuilder {
        private String model;
        private String input;
        private String voice;
        private String responseFormat;
        private Double speed;

        CreateSpeechRequestBuilder() {
        }

        public CreateSpeechRequestBuilder model(String model) {
            if (model == null) {
                throw new NullPointerException("model is marked non-null but is null");
            } else {
                this.model = model;
                return this;
            }
        }

        public CreateSpeechRequestBuilder input(String input) {
            if (input == null) {
                throw new NullPointerException("input is marked non-null but is null");
            } else {
                this.input = input;
                return this;
            }
        }

        public CreateSpeechRequestBuilder voice( String voice) {
            if (voice == null) {
                throw new NullPointerException("voice is marked non-null but is null");
            } else {
                this.voice = voice;
                return this;
            }
        }

        @JsonProperty("response_format")
        public CreateSpeechRequestBuilder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public CreateSpeechRequestBuilder speed(Double speed) {
            this.speed = speed;
            return this;
        }

        public CreateSpeechRequest build() {
            return new CreateSpeechRequest(this.model, this.input, this.voice, this.responseFormat, this.speed);
        }

        public String toString() {
            return "CreateSpeechRequest.CreateSpeechRequestBuilder(model=" + this.model + ", input=" + this.input + ", voice=" + this.voice + ", responseFormat=" + this.responseFormat + ", speed=" + this.speed + ")";
        }
    }


}
