package com.theokanning.openai.moderation;

/**
 * A request for OpenAi to detect if text violates OpenAi's content policy.
 *
 * https://beta.openai.com/docs/api-reference/moderations/create
 */
public class ModerationRequest {

    /**
     * The input text to classify.
     */
    String input;

    /**
     * The name of the model to use, defaults to text-moderation-stable.
     */
    String model;

    public static ModerationRequestBuilder builder() {
        return new ModerationRequestBuilder();
    }


    public ModerationRequest(String input, String model) {
        this.input = input;
        this.model = model;
    }

    public ModerationRequest() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "ModerationRequest{" +
                "input='" + input + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public static class ModerationRequestBuilder {
        private String input;
        private String model;

        ModerationRequestBuilder() {
        }

        public ModerationRequestBuilder input(String input) {
            if (input == null) {
                throw new NullPointerException("input is marked non-null but is null");
            } else {
                this.input = input;
                return this;
            }
        }

        public ModerationRequestBuilder model(String model) {
            this.model = model;
            return this;
        }

        public ModerationRequest build() {
            return new ModerationRequest(this.input, this.model);
        }

        public String toString() {
            return "ModerationRequest.ModerationRequestBuilder(input=" + this.input + ", model=" + this.model + ")";
        }
    }
}
