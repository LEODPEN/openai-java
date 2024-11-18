package com.theokanning.openai.messages;

import java.util.Map;

/**
 * Modifies a Message
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/modifyMessage
 */
public class ModifyMessageRequest {

    /**
     * Set of 16 key-value pairs that can be attached to an object.
     * This can be useful for storing additional information about the object in a structured format.
     * Keys can be a maximum of 64 characters long, and values can be a maximum of 512 characters long.
     */
    Map<String, String> metadata;

    public static ModifyMessageRequestBuilder builder() {
        return new ModifyMessageRequestBuilder();
    }


    public ModifyMessageRequest(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public ModifyMessageRequest() {
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public String toString() {
        return "ModifyMessageRequest(metadata=" + this.getMetadata() + ")";
    }

    public static class ModifyMessageRequestBuilder {
        private Map<String, String> metadata;

        ModifyMessageRequestBuilder() {
        }

        public ModifyMessageRequestBuilder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public ModifyMessageRequest build() {
            return new ModifyMessageRequest(this.metadata);
        }

        public String toString() {
            return "ModifyMessageRequest.ModifyMessageRequestBuilder(metadata=" + this.metadata + ")";
        }
    }
}
