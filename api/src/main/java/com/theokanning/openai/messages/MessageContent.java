package com.theokanning.openai.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.theokanning.openai.messages.content.ImageFile;
import com.theokanning.openai.messages.content.Text;


/**
 * Represents the content of a message
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
public class MessageContent {
    /**
     * The content type, either "text" or "image_file"
     */
    String type;

    /**
     * Text content of the message. Only present if type == text
     */
    Text text;

    /**
     * The image content of a message. Only present if type == image_file
     */
    @JsonProperty("image_file")
    ImageFile imageFile;

    public MessageContent(String type, Text text, ImageFile imageFile) {
        this.type = type;
        this.text = text;
        this.imageFile = imageFile;
    }

    public MessageContent() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public ImageFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(ImageFile imageFile) {
        this.imageFile = imageFile;
    }

    @Override
    public String toString() {
        return "MessageContent{" +
                "type='" + type + '\'' +
                ", text=" + text +
                ", imageFile=" + imageFile +
                '}';
    }
}
