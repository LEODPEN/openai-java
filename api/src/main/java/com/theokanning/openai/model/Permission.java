package com.theokanning.openai.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Model permissions
 * I couldn't find documentation for the specific permissions, and I've elected to leave them undocumented rather than
 * write something incorrect.
 *
 * https://beta.openai.com/docs/api-reference/models
 */

public class Permission {
    /**
     * An identifier for this model permission
     */
    public String id;

    /**
     * The type of object returned, should be "model_permission"
     */
    public String object;

    /**
     * The creation time in epoch seconds.
     */
    public long created;

    @JsonProperty("allow_create_engine")
    public boolean allowCreateEngine;

    @JsonProperty("allow_sampling")
    public boolean allowSampling;

    @JsonProperty("allow_log_probs")
    public boolean allowLogProbs;

    @JsonProperty("allow_search_indices")
    public boolean allowSearchIndices;

    @JsonProperty("allow_view")
    public boolean allowView;

    @JsonProperty("allow_fine_tuning")
    public boolean allowFineTuning;

    public String organization;

    public String group;

    @JsonProperty("is_blocking")
    public boolean isBlocking;

    public Permission(String id, String object, long created, boolean allowCreateEngine, boolean allowSampling, boolean allowLogProbs, boolean allowSearchIndices, boolean allowView, boolean allowFineTuning, String organization, String group, boolean isBlocking) {
        this.id = id;
        this.object = object;
        this.created = created;
        this.allowCreateEngine = allowCreateEngine;
        this.allowSampling = allowSampling;
        this.allowLogProbs = allowLogProbs;
        this.allowSearchIndices = allowSearchIndices;
        this.allowView = allowView;
        this.allowFineTuning = allowFineTuning;
        this.organization = organization;
        this.group = group;
        this.isBlocking = isBlocking;
    }

    public Permission() {
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

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public boolean isAllowCreateEngine() {
        return allowCreateEngine;
    }

    public void setAllowCreateEngine(boolean allowCreateEngine) {
        this.allowCreateEngine = allowCreateEngine;
    }

    public boolean isAllowSampling() {
        return allowSampling;
    }

    public void setAllowSampling(boolean allowSampling) {
        this.allowSampling = allowSampling;
    }

    public boolean isAllowLogProbs() {
        return allowLogProbs;
    }

    public void setAllowLogProbs(boolean allowLogProbs) {
        this.allowLogProbs = allowLogProbs;
    }

    public boolean isAllowSearchIndices() {
        return allowSearchIndices;
    }

    public void setAllowSearchIndices(boolean allowSearchIndices) {
        this.allowSearchIndices = allowSearchIndices;
    }

    public boolean isAllowView() {
        return allowView;
    }

    public void setAllowView(boolean allowView) {
        this.allowView = allowView;
    }

    public boolean isAllowFineTuning() {
        return allowFineTuning;
    }

    public void setAllowFineTuning(boolean allowFineTuning) {
        this.allowFineTuning = allowFineTuning;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isBlocking() {
        return isBlocking;
    }

    public void setBlocking(boolean blocking) {
        isBlocking = blocking;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", created=" + created +
                ", allowCreateEngine=" + allowCreateEngine +
                ", allowSampling=" + allowSampling +
                ", allowLogProbs=" + allowLogProbs +
                ", allowSearchIndices=" + allowSearchIndices +
                ", allowView=" + allowView +
                ", allowFineTuning=" + allowFineTuning +
                ", organization='" + organization + '\'' +
                ", group='" + group + '\'' +
                ", isBlocking=" + isBlocking +
                '}';
    }
}
