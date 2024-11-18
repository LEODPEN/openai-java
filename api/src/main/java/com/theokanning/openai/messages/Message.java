package com.theokanning.openai.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;


/**
 * Represents a Message within a thread.
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
public class Message {
    /**
     * The identifier, which can be referenced in API endpoints.
     */
    String id;

    /**
     * The object type, which is always thread.message.
     */
    String object;

    /**
     * The Unix timestamp (in seconds) for when the message was created.
     */
    @JsonProperty("created_at")
    int createdAt;

    /**
     * The thread ID that this message belongs to.
     */
    @JsonProperty("thread_id")
    String threadId;

    /**
     * The entity that produced the message. One of user or assistant.
     */
    String role;

    /**
     * The content of the message in an array of text and/or images.
     */
    List<MessageContent> content;

    /**
     * If applicable, the ID of the assistant that authored this message.
     */
    @JsonProperty("assistant_id")
    String assistantId;

    /**
     * If applicable, the ID of the run associated with the authoring of this message.
     */
    @JsonProperty("run_id")
    String runId;

    /**
     * A list of file IDs that the assistant should use.
     * Useful for tools like retrieval and code_interpreter that can access files.
     * A maximum of 10 files can be attached to a message.
     */
    @JsonProperty("file_ids")
    List<String> fileIds;

    /**
     * Set of 16 key-value pairs that can be attached to an object.
     * This can be useful for storing additional information about the object in a structured format.
     * Keys can be a maximum of 64 characters long, and values can be a maximum of 512 characters long.
     */
    Map<String, String> metadata;

    public Message(String id, String object, int createdAt, String threadId, String role, List<MessageContent> content, String assistantId, String runId, List<String> fileIds, Map<String, String> metadata) {
        this.id = id;
        this.object = object;
        this.createdAt = createdAt;
        this.threadId = threadId;
        this.role = role;
        this.content = content;
        this.assistantId = assistantId;
        this.runId = runId;
        this.fileIds = fileIds;
        this.metadata = metadata;
    }

    public Message() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public int getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(int createdAt) {
        this.createdAt = createdAt;
    }

    public String getThreadId() {
        return threadId;
    }

    public void setThreadId(String threadId) {
        this.threadId = threadId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<MessageContent> getContent() {
        return content;
    }

    public void setContent(List<MessageContent> content) {
        this.content = content;
    }

    public String getAssistantId() {
        return assistantId;
    }

    public void setAssistantId(String assistantId) {
        this.assistantId = assistantId;
    }

    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public List<String> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<String> fileIds) {
        this.fileIds = fileIds;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", createdAt=" + createdAt +
                ", threadId='" + threadId + '\'' +
                ", role='" + role + '\'' +
                ", content=" + content +
                ", assistantId='" + assistantId + '\'' +
                ", runId='" + runId + '\'' +
                ", fileIds=" + fileIds +
                ", metadata=" + metadata +
                '}';
    }
}