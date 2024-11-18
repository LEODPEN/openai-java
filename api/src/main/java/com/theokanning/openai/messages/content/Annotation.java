package com.theokanning.openai.messages.content;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * An annotation for a text Message
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
public class Annotation {
    /**
     * The type of annotation, either file_citation or file_path
     */
    String type;

    /**
     * The text in the message content that needs to be replaced
     */
    String text;

    /**
     * File citation details, only present when type == file_citation
     */
    @JsonProperty("file_citation")
    FileCitation fileCitation;

    /**
     * File path details, only present when type == file_path
     */
    @JsonProperty("file_path")
    FilePath filePath;

    @JsonProperty("start_index")
    int startIndex;

    @JsonProperty("end_index")
    int endIndex;


    public Annotation(String type, String text, FileCitation fileCitation, FilePath filePath, int startIndex, int endIndex) {
        this.type = type;
        this.text = text;
        this.fileCitation = fileCitation;
        this.filePath = filePath;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public Annotation() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FileCitation getFileCitation() {
        return fileCitation;
    }

    public void setFileCitation(FileCitation fileCitation) {
        this.fileCitation = fileCitation;
    }

    public FilePath getFilePath() {
        return filePath;
    }

    public void setFilePath(FilePath filePath) {
        this.filePath = filePath;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    @Override
    public String toString() {
        return "Annotation{" +
                "type='" + type + '\'' +
                ", text='" + text + '\'' +
                ", fileCitation=" + fileCitation +
                ", filePath=" + filePath +
                ", startIndex=" + startIndex +
                ", endIndex=" + endIndex +
                '}';
    }
}
