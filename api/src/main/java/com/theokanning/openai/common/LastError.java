package com.theokanning.openai.common;

/**
 * @description:
 * @author: vacuity
 * @create: 2023-11-16 22:27
 **/


public class LastError {
    
    private String code;
    
    private String message;

    public LastError() {
    }

    public LastError(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LastError{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
