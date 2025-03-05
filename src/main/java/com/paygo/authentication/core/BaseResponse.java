package com.paygo.authentication.core;

import com.paygo.authentication.model.enums.HttpStatus;
import lombok.Data;

@Data
public class BaseResponse <T>{
    private T body;
    private HttpStatus code;
    private String status;
    private String message;

    public void httpStatusCode(HttpStatus code) {
        this.code = code;
    }

    public void setBody(HttpStatus code, T body) {
        this.body = body;
        this.code = code;
    }

    public void setErrorMessage(HttpStatus code, String errorCode, String errorMessage) {
        this.code = code;
        this.status = errorCode;
        this.message = errorMessage;
    }

}
