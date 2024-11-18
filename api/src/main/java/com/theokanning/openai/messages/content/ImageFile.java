package com.theokanning.openai.messages.content;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * References an image File int eh content of a message.
 * <p>
 * /https://platform.openai.com/docs/api-reference/messages/object
 */
public class ImageFile {

    /**
     * The File ID of the image in the message content.
     */
    @JsonProperty("file_id")
    String fileId;

    public ImageFile(String fileId) {
        this.fileId = fileId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }


    public ImageFile() {
    }

    @Override
    public String toString() {
        return "ImageFile{" +
                "fileId='" + fileId + '\'' +
                '}';
    }
}
