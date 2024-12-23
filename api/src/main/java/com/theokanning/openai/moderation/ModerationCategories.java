package com.theokanning.openai.moderation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing the flags for each moderation category
 *
 * https://beta.openai.com/docs/api-reference/moderations/create
 */
public class ModerationCategories {

    public boolean hate;

    @JsonProperty("hate/threatening")
    public boolean hateThreatening;

    @JsonProperty("self-harm")
    public boolean selfHarm;

    public boolean sexual;

    @JsonProperty("sexual/minors")
    public boolean sexualMinors;

    public boolean violence;

    @JsonProperty("violence/graphic")
    public boolean violenceGraphic;

    public ModerationCategories(boolean hate, boolean hateThreatening, boolean selfHarm, boolean sexual, boolean sexualMinors, boolean violence, boolean violenceGraphic) {
        this.hate = hate;
        this.hateThreatening = hateThreatening;
        this.selfHarm = selfHarm;
        this.sexual = sexual;
        this.sexualMinors = sexualMinors;
        this.violence = violence;
        this.violenceGraphic = violenceGraphic;
    }

    public ModerationCategories() {
    }

    public boolean isHate() {
        return hate;
    }

    public void setHate(boolean hate) {
        this.hate = hate;
    }

    public boolean isHateThreatening() {
        return hateThreatening;
    }

    public void setHateThreatening(boolean hateThreatening) {
        this.hateThreatening = hateThreatening;
    }

    public boolean isSelfHarm() {
        return selfHarm;
    }

    public void setSelfHarm(boolean selfHarm) {
        this.selfHarm = selfHarm;
    }

    public boolean isSexual() {
        return sexual;
    }

    public void setSexual(boolean sexual) {
        this.sexual = sexual;
    }

    public boolean isSexualMinors() {
        return sexualMinors;
    }

    public void setSexualMinors(boolean sexualMinors) {
        this.sexualMinors = sexualMinors;
    }

    public boolean isViolence() {
        return violence;
    }

    public void setViolence(boolean violence) {
        this.violence = violence;
    }

    public boolean isViolenceGraphic() {
        return violenceGraphic;
    }

    public void setViolenceGraphic(boolean violenceGraphic) {
        this.violenceGraphic = violenceGraphic;
    }

    @Override
    public String toString() {
        return "ModerationCategories{" +
                "hate=" + hate +
                ", hateThreatening=" + hateThreatening +
                ", selfHarm=" + selfHarm +
                ", sexual=" + sexual +
                ", sexualMinors=" + sexualMinors +
                ", violence=" + violence +
                ", violenceGraphic=" + violenceGraphic +
                '}';
    }
}
