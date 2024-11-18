package com.theokanning.openai.image;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A request for OpenAi to create a variation of an image
 * All fields are optional
 *
 * https://beta.openai.com/docs/api-reference/images/create-variation
 */
public class CreateImageVariationRequest {

    /**
     * The number of images to generate. Must be between 1 and 10. Defaults to 1.
     */
    Integer n;

    /**
     * The model to use for image generation. Only dall-e-2 is supported at this time. Defaults to dall-e-2.
     */
    String model;

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

    public static CreateImageVariationRequestBuilder builder() {
        return new CreateImageVariationRequestBuilder();
    }


    public CreateImageVariationRequest(Integer n, String model, String size, String responseFormat, String user) {
        this.n = n;
        this.model = model;
        this.size = size;
        this.responseFormat = responseFormat;
        this.user = user;
    }

    public CreateImageVariationRequest() {
    }

    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "CreateImageVariationRequest{" +
                "n=" + n +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", responseFormat='" + responseFormat + '\'' +
                ", user='" + user + '\'' +
                '}';
    }

    public static class CreateImageVariationRequestBuilder {
        private Integer n;
        private String model;
        private String size;
        private String responseFormat;
        private String user;

        CreateImageVariationRequestBuilder() {
        }

        public CreateImageVariationRequestBuilder n(Integer n) {
            this.n = n;
            return this;
        }

        public CreateImageVariationRequestBuilder model(String model) {
            this.model = model;
            return this;
        }

        public CreateImageVariationRequestBuilder size(String size) {
            this.size = size;
            return this;
        }

        @JsonProperty("response_format")
        public CreateImageVariationRequestBuilder responseFormat(String responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        public CreateImageVariationRequestBuilder user(String user) {
            this.user = user;
            return this;
        }

        public CreateImageVariationRequest build() {
            return new CreateImageVariationRequest(this.n, this.model, this.size, this.responseFormat, this.user);
        }

        public String toString() {
            return "CreateImageVariationRequest.CreateImageVariationRequestBuilder(n=" + this.n + ", model=" + this.model + ", size=" + this.size + ", responseFormat=" + this.responseFormat + ", user=" + this.user + ")";
        }
    }
}
