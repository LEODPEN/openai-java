package com.theokanning.openai.messages.content;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A citation within the message that points to a specific quote from a specific File associated with the
 * assistant or the message. Generated when the assistant uses the "retrieval" tool to search files.
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
public class FileCitation {

    /**
     * The ID of the specific File the citation is from.
     */
    @JsonProperty("file_id")
    String fileId;

    /**
     * The specific quote in the file.
     */
    String quote;

    public FileCitation(String fileId, String quote) {
        this.fileId = fileId;
        this.quote = quote;
    }

    public FileCitation() {
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "FileCitation{" +
                "fileId='" + fileId + '\'' +
                ", quote='" + quote + '\'' +
                '}';
    }
}
