package com.theokanning.openai.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * GPT model details
 *
 * https://beta.openai.com/docs/api-reference/models
 */
public class Model {
    /**
     * An identifier for this model, used to specify the model when making completions, etc
     */
    public String id;

    /**
     * The type of object returned, should be "model"
     */
    public String object;

    /**
     * The owner of the model, typically "openai"
     */
    @JsonProperty("owned_by")
    public String ownedBy;

    /**
     * List of permissions for this model. No longer returned by OpenAI
     */
    @Deprecated
    public List<Permission> permission;

    /**
     * The root model that this and its parent (if applicable) are based on
     */
    public String root;

    /**
     * The parent model that this is based on
     */
    public String parent;

    public Model(String id, String object, String ownedBy, List<Permission> permission, String root, String parent) {
        this.id = id;
        this.object = object;
        this.ownedBy = ownedBy;
        this.permission = permission;
        this.root = root;
        this.parent = parent;
    }

    public Model() {
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

    public String getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    public List<Permission> getPermission() {
        return permission;
    }

    public void setPermission(List<Permission> permission) {
        this.permission = permission;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id='" + id + '\'' +
                ", object='" + object + '\'' +
                ", ownedBy='" + ownedBy + '\'' +
                ", permission=" + permission +
                ", root='" + root + '\'' +
                ", parent='" + parent + '\'' +
                '}';
    }
}
