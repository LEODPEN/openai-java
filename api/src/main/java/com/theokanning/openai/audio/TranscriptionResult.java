package com.theokanning.openai.audio;



import java.util.List;

/**
 * An object with the text transcription
 *
 * https://platform.openai.com/docs/api-reference/audio/create
 */
public class TranscriptionResult {

    /**
     * The text transcription.
     */
    String text;

    /**
     * Task name
     * @apiNote verbose_json response format only
     */
    String task;

    /**
     * Speech language
     * @apiNote verbose_json response format only
     */
    String language;

    /**
     * Speech duration
     * @apiNote verbose_json response format only
     */
    Double duration;

    /**
     * List of segments
     * @apiNote verbose_json response format only
     */
    List<TranscriptionSegment> segments;

    public TranscriptionResult() {
    }

    public String getText() {
        return this.text;
    }

    public String getTask() {
        return this.task;
    }

    public String getLanguage() {
        return this.language;
    }

    public Double getDuration() {
        return this.duration;
    }

    public List<TranscriptionSegment> getSegments() {
        return this.segments;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public void setSegments(List<TranscriptionSegment> segments) {
        this.segments = segments;
    }

    public String toString() {
        return "TranscriptionResult(text=" + this.getText() + ", task=" + this.getTask() + ", language=" + this.getLanguage() + ", duration=" + this.getDuration() + ", segments=" + this.getSegments() + ")";
    }

}
