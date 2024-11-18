package com.theokanning.openai.image;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request for OpenAi to edit an image based on a prompt
 * All fields except prompt are optional
 *
 * https://beta.openai.com/docs/api-reference/images/create-edit
 */
public class CreateImageEditRequest {

    /**
     * A text description of the desired image(s). The maximum length in 1000 characters.
     */
    String prompt;

    /**
     * The model to use for image generation. Only dall-e-2 is supported at this time. Defaults to dall-e-2.
     */
    String model;

    /**
     * The number of images to generate. Must be between 1 and 10. Defaults to 1.
     */
    Integer n;

    /**
     * The size of the generated images. Must be one of "256x256", "512x512", or "1024x1024". Defaults to "1024x1024".
     */
    String size;

    /**
     * The format in which the generated images are returned. Must be one of url or b64_json. Defaults to url.
     */
    @JsonProperty("response_format")
    String responseFormat;

    /**
     * A unique identifier representing your end-user, which will help OpenAI to monitor and detect abuse.
     */
    String user;

    public static CreateImageEditRequestBuilder builder() {
        return new CreateImageEditRequestBuilder();
    }


    public CreateImageEditRequest(String prompt, String model, Integer n, String size, String responseFormat, String user) {
        this.prompt = prompt;
        this.model = model;
        this.n = n;
        this.size = size;
        this.responseFormat = responseFormat;
        this.user = user;
    }

    public CreateImageEditRequest() {
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(String responseFormat) {
        this.responseFormat = responseFormat;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "CreateImageEditRequest{" +
                "prompt='" + prompt + '\'' +
                ", model='" + model + '\'' +
                ", n=" + n +
                ", size='" + size + '\'' +
                ", responseFormat='" + responseFormat + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public static class CreateImageEditRequestBuilder {
        private String prompt;
        private String model;
        private Integer n;
        private String size;
        private String responseFormat;
        private String user;

        CreateImageEditRequestBuilder() {
        }

        public CreateImageEditRequestBuilder prompt(String prompt) {
            if (prompt == null) {
                throw new NullPointerException("prompt is marked non-null but is null");
            } else {
                this.prompt = prompt;
                return this;
            }
        }

        public CreateImageEditRequestBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CreateImageEditRequestBuilder n(Integer n) {
            this.n = n;
            return this;
        }

        public CreateImageEditRequestBuilder size(String size) {
            this.size = size;
            return this;
        }

        @JsonProperty("response_format")
        public CreateImageEditRequestBuilder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public CreateImageEditRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public CreateImageEditRequest build() {
            return new CreateImageEditRequest(this.prompt, this.model, this.n, this.size, this.responseFormat, this.user);
        }

        public String toString() {
            return "CreateImageEditRequest.CreateImageEditRequestBuilder(prompt=" + this.prompt + ", model=" + this.model + ", n=" + this.n + ", size=" + this.size + ", responseFormat=" + this.responseFormat + ", user=" + this.user + ")";
        }
    }
}
