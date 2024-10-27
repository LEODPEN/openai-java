package com.theokanning.openai.assistants;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AssistantFile {

    /**
     * The identifier of the Assistant File
     */
    private String id;

    /**
     * The object type, which is always assistant.file.
     */
    private String object;

    /**
     * The Unix timestamp (in seconds) for when the assistant file was created.
     */
    @JsonProperty("created_at")
    private String createdAt;

    /**
     * The assistant ID that the file is attached to
     */
    @JsonProperty("assistant_id")
    private String assistantId;

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for object
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    // Getter and Setter for createdAt
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    // Getter and Setter for assistantId
    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    @Override
    public String toString() {
        return "AssistantFile{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", assistantId='" + assistantId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AssistantFile)) return false;

        AssistantFile that = (AssistantFile) o;

        if (!id.equals(that.id)) return false;
        if (!object.equals(that.object)) return false;
        if (!createdAt.equals(that.createdAt)) return false;
        return assistantId.equals(that.assistantId);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + object.hashCode();
        result = 31 * result + createdAt.hashCode();
        result = 31 * result + assistantId.hashCode();
        return result;
    }
    public static class Builder {
        private String id;
        private String object;
        private String createdAt;
        private String assistantId;

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setObject(String object) {
            this.object = object;
            return this;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setAssistantId(String assistantId) {
            this.assistantId = assistantId;
            return this;
        }

        public AssistantFile build() {
            return new AssistantFile(this);
        }
    }
    private AssistantFile(Builder builder) {
        this.id = builder.id;
        this.object = builder.object;
        this.createdAt = builder.createdAt;
        this.assistantId = builder.assistantId;
    }
}