package com.theokanning.openai.assistants;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class AssistantFileRequest {

    @JsonProperty("file_id")
    String fileId;

    public AssistantFileRequest(String fileId) {
        this.fileId = fileId;
    }

    public AssistantFileRequest() {
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    @Override
    public String toString() {
        return "AssistantFileRequest{" +
                "fileId='" + fileId + '\'' +
                '}';
    }
}
