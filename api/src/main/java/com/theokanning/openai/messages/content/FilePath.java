package com.theokanning.openai.messages.content;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A URL for the file that's generated when the assistant used the code_interpreter tool to generate a file.
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
public class FilePath {

    /**
     * The ID of the file that was generated
     */
    @JsonProperty("file_id")
    String fileId;

    public FilePath(String fileId) {
        this.fileId = fileId;
    }

    public FilePath() {
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "FilePath{" +
                "fileId='" + fileId + '\'' +
                '}';
    }
}
