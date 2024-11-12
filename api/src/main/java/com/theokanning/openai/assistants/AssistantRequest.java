package com.theokanning.openai.assistants;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;
import java.util.Map;

public class AssistantRequest {

    /**
     * ID of the model to use
     */
    @NonNull
    String model;

    /**
     * The name of the assistant. The maximum length is 256
     */
    String name;

    /**
     * The description of the assistant.
     */
    String description;

    /**
     * The system instructions that the assistant uses.
     */
    String instructions;

    /**
     * A list of tools enabled on the assistant.
     */
    List<Tool> tools;

    /**
     * A list of file IDs attached to this assistant.
     */
    @JsonProperty("file_ids")
    List<String> fileIds;

    /**
     * Set of 16 key-value pairs that can be attached to an object.
     */
    Map<String, String> metadata;

    public static AssistantRequestBuilder builder() {
        return new AssistantRequestBuilder();
    }

    public AssistantRequest(@NonNull String model, String name, String description, String instructions, List<Tool> tools, List<String> fileIds, Map<String, String> metadata) {
        this.model = model;
        this.name = name;
        this.description = description;
        this.instructions = instructions;
        this.tools = tools;
        this.fileIds = fileIds;
        this.metadata = metadata;
    }

    public AssistantRequest() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public List<Tool> getTools() {
        return tools;
    }

    public void setTools(List<Tool> tools) {
        this.tools = tools;
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
        return "AssistantRequest{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", instructions='" + instructions + '\'' +
                ", tools=" + tools +
                ", fileIds=" + fileIds +
                ", metadata=" + metadata +
                '}';
    }

    public static class AssistantRequestBuilder {
        private String model;
        private String name;
        private String description;
        private String instructions;
        private List<Tool> tools;
        private List<String> fileIds;
        private Map<String, String> metadata;

        AssistantRequestBuilder() {
        }

        public AssistantRequestBuilder model(@NonNull String model) {
            if (model == null) {
                throw new NullPointerException("model is marked non-null but is null");
            } else {
                this.model = model;
                return this;
            }
        }

        public AssistantRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AssistantRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AssistantRequestBuilder instructions(String instructions) {
            this.instructions = instructions;
            return this;
        }

        public AssistantRequestBuilder tools(List<Tool> tools) {
            this.tools = tools;
            return this;
        }

        @JsonProperty("file_ids")
        public AssistantRequestBuilder fileIds(List<String> fileIds) {
            this.fileIds = fileIds;
            return this;
        }

        public AssistantRequestBuilder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public AssistantRequest build() {
            return new AssistantRequest(this.model, this.name, this.description, this.instructions, this.tools, this.fileIds, this.metadata);
        }

        public String toString() {
            return "AssistantRequest.AssistantRequestBuilder(model=" + this.model + ", name=" + this.name + ", description=" + this.description + ", instructions=" + this.instructions + ", tools=" + this.tools + ", fileIds=" + this.fileIds + ", metadata=" + this.metadata + ")";
        }
    }
}
