package com.theokanning.openai.completion.chat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Set;

@Data
@Builder
public class ChatFunctionProperty {
    @NonNull
    @JsonIgnore
    private String name;
    @NonNull
    private String type;
    @JsonIgnore
    private Boolean required;
    private String description;
    private ChatFunctionProperty items;
    @JsonProperty("enum")
    private Set<?> enumValues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChatFunctionProperty getItems() {
        return items;
    }

    public void setItems(ChatFunctionProperty items) {
        this.items = items;
    }

    public Set<?> getEnumValues() {
        return enumValues;
    }

    public void setEnumValues(Set<?> enumValues) {
        this.enumValues = enumValues;
    }
}