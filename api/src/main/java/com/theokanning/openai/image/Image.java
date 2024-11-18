package com.theokanning.openai.image;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing either a URL or a base 64 encoded image.
 *
 * https://beta.openai.com/docs/api-reference/images
 */
public class Image {
    /**
     * The URL where the image can be accessed.
     */
    String url;


    /**
     * Base64 encoded image string.
     */
    @JsonProperty("b64_json")
    String b64Json;

    /**
     * The prompt that was used to generate the image, if there was any revision to the prompt.
     */
    @JsonProperty("revised_prompt")
    String revisedPrompt;

    public Image(String url, String b64Json, String revisedPrompt) {
        this.url = url;
        this.b64Json = b64Json;
        this.revisedPrompt = revisedPrompt;
    }

    public Image() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getB64Json() {
        return b64Json;
    }

    public void setB64Json(String b64Json) {
        this.b64Json = b64Json;
    }

    public String getRevisedPrompt() {
        return revisedPrompt;
    }

    public void setRevisedPrompt(String revisedPrompt) {
        this.revisedPrompt = revisedPrompt;
    }

    @Override
    public String toString() {
        return "Image{" +
                "url='" + url + '\'' +
                ", b64Json='" + b64Json + '\'' +
                ", revisedPrompt='" + revisedPrompt + '\'' +
                '}';
    }
}
