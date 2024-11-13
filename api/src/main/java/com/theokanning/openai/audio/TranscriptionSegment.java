package com.theokanning.openai.audio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * An object represents transcription segment
 *
 * https://platform.openai.com/docs/api-reference/audio/create
 */
public class TranscriptionSegment {

    Integer id;
    Integer seek;
    Double start;
    Double end;
    String text;
    List<Integer> tokens;
    Double temperature;
    @JsonProperty("avg_logprob")
    Double averageLogProb;
    @JsonProperty("compression_ratio")
    Double compressionRatio;
    @JsonProperty("no_speech_prob")
    Double noSpeechProb;
    @JsonProperty("transient")
    Boolean transientFlag;
    public TranscriptionSegment() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getSeek() {
        return this.seek;
    }

    public Double getStart() {
        return this.start;
    }

    public Double getEnd() {
        return this.end;
    }

    public String getText() {
        return this.text;
    }

    public List<Integer> getTokens() {
        return this.tokens;
    }

    public Double getTemperature() {
        return this.temperature;
    }

    public Double getAverageLogProb() {
        return this.averageLogProb;
    }

    public Double getCompressionRatio() {
        return this.compressionRatio;
    }

    public Double getNoSpeechProb() {
        return this.noSpeechProb;
    }

    public Boolean getTransientFlag() {
        return this.transientFlag;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSeek(Integer seek) {
        this.seek = seek;
    }

    public void setStart(Double start) {
        this.start = start;
    }

    public void setEnd(Double end) {
        this.end = end;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTokens(List<Integer> tokens) {
        this.tokens = tokens;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @JsonProperty("avg_logprob")
    public void setAverageLogProb(Double averageLogProb) {
        this.averageLogProb = averageLogProb;
    }

    @JsonProperty("compression_ratio")
    public void setCompressionRatio(Double compressionRatio) {
        this.compressionRatio = compressionRatio;
    }

    @JsonProperty("no_speech_prob")
    public void setNoSpeechProb(Double noSpeechProb) {
        this.noSpeechProb = noSpeechProb;
    }

    @JsonProperty("transient")
    public void setTransientFlag(Boolean transientFlag) {
        this.transientFlag = transientFlag;
    }
    public String toString() {
        return "TranscriptionSegment(id=" + this.getId() + ", seek=" + this.getSeek() + ", start=" + this.getStart() + ", end=" + this.getEnd() + ", text=" + this.getText() + ", tokens=" + this.getTokens() + ", temperature=" + this.getTemperature() + ", averageLogProb=" + this.getAverageLogProb() + ", compressionRatio=" + this.getCompressionRatio() + ", noSpeechProb=" + this.getNoSpeechProb() + ", transientFlag=" + this.getTransientFlag() + ")";
    }
}
