package com.theokanning.openai.assistants;



public class Tool {
     /**
      * The type of tool being defined
      */
     AssistantToolsEnum type;

     /**
      * Function definition, only used if type is "function"
      */
     AssistantFunction function;

     public Tool(AssistantToolsEnum type, AssistantFunction function) {
          this.type = type;
          this.function = function;
     }

     public AssistantToolsEnum getType() {
          return type;
     }

     public void setType(AssistantToolsEnum type) {
          this.type = type;
     }

     public AssistantFunction getFunction() {
          return function;
     }

     public void setFunction(AssistantFunction function) {
          this.function = function;
     }

     public Tool() {
     }

     @Override
     public String toString() {
          return "Tool{" +
                  "type=" + type +
                  ", function=" + function +
                  '}';
     }
}
