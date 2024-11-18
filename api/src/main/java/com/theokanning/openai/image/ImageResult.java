package com.theokanning.openai.image;

import java.util.List;

/**
 * An object with a list of image results.
 *
 * https://beta.openai.com/docs/api-reference/images
 */
public class ImageResult {

    /**
     * The creation time in epoch seconds.
     */
    Long created;

    /**
     * List of image results.
     */
    List<Image> data;

    public ImageResult(Long created, List<Image> data) {
        this.created = created;
        this.data = data;
    }

    public ImageResult() {
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public List<Image> getData() {
        return data;
    }

    public void setData(List<Image> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ImageResult{" +
                "created=" + created +
                ", data=" + data +
                '}';
    }
}
