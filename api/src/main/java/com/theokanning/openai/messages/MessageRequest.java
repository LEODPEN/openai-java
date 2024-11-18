package com.theokanning.openai.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

/**
 * Creates a Message
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/createMessage
 */
public class MessageRequest {
    /**
     * The role of the entity that is creating the message.
     * Currently only "user" is supported.
     */
    String role = "user";

    /**
     * The content of the message.
     */

    String content;

    /**
     * A list of File IDs that the message should use.
     * Defaults to an empty list.
     * There can be a maximum of 10 files attached to a message.
     * Useful for tools like retrieval and code_interpreter that can access and use files.
     */
    @JsonProperty("file_ids")
    List<String> fileIds;

    /**
     * Set of 16 key-value pairs that can be attached to an object.
     * This can be useful for storing additional information about the object in a structured format.
     * Keys can be a maximum of 64 characters long, and values can be a maximum of 512 characters long.
     */
    Map<String, String> metadata;

    public static MessageRequestBuilder builder() {
        return new MessageRequestBuilder();
    }

    private static String $default$role() {
        return "user";
    }

    public MessageRequest(String role, String content, List<String> fileIds, Map<String, String> metadata) {
        this.role = role;
        this.content = content;
        this.fileIds = fileIds;
        this.metadata = metadata;
    }

    public MessageRequest() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        return "MessageRequest{" +
                "role='" + role + '\'' +
                ", content='" + content + '\'' +
                ", fileIds=" + fileIds +
                ", metadata=" + metadata +
                '}';
    }

    public static class MessageRequestBuilder {
        private boolean role$set;
        private String role$value;
        private String content;
        private List<String> fileIds;
        private Map<String, String> metadata;

        MessageRequestBuilder() {
        }

        public MessageRequestBuilder role(String role) {
            if (role == null) {
                throw new NullPointerException("role is marked non-null but is null");
            } else {
                this.role$value = role;
                this.role$set = true;
                return this;
            }
        }

        public MessageRequestBuilder content(String content) {
            if (content == null) {
                throw new NullPointerException("content is marked non-null but is null");
            } else {
                this.content = content;
                return this;
            }
        }

        @JsonProperty("file_ids")
        public MessageRequestBuilder fileIds(List<String> fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        public MessageRequestBuilder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public MessageRequest build() {
            String role$value = this.role$value;
            if (!this.role$set) {
                role$value = MessageRequest.$default$role();
            }

            return new MessageRequest(role$value, this.content, this.fileIds, this.metadata);
        }

        public String toString() {
            return "MessageRequest.MessageRequestBuilder(role$value=" + this.role$value + ", content=" + this.content + ", fileIds=" + this.fileIds + ", metadata=" + this.metadata + ")";
        }
    }
}
