package com.paygo.authentication.controller;

import com.paygo.authentication.core.BaseResponse;
import com.paygo.authentication.model.enums.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
@RequestMapping(LoginController.CONTEXT)
public class LoginController {
    public static final String CONTEXT = "/login";

    @GetMapping("/login")
    public String login() {
        return "hello!";
    }
}
