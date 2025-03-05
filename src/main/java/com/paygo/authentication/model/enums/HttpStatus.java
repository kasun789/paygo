package com.paygo.authentication.model.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum HttpStatus {
    OK(200), BAD_REQUEST(400), INTERNAL_SERVER_ERROR(500);

    private final int id;

    HttpStatus(int id) {
        this.id = id;
    }
}
