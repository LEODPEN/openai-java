package com.theokanning.openai.messages.content;

import java.util.List;

/**
 * The text content that is part of a message
 * <p>
 * https://platform.openai.com/docs/api-reference/messages/object
 */
public class Text {

    /**
     * The data that makes up the text.
     */
    String value;

    /**
     * Text annotations that show additional details
     */
    List<Annotation> annotations;

    public Text(String value, List<Annotation> annotations) {
        this.value = value;
        this.annotations = annotations;
    }

    public Text() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<Annotation> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<Annotation> annotations) {
        this.annotations = annotations;
    }

    @Override
    public String toString() {
        return "Text{" +
                "value='" + value + '\'' +
                ", annotations=" + annotations +
                '}';
    }
}
