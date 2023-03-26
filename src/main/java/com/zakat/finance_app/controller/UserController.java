package com.zakat.finance_app.controller;

import com.zakat.finance_app.model.User;
import com.zakat.finance_app.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController extends BasicController<User, Long> {
    private final UserService userService;

    protected UserController(UserService userService) {
        super(userService);
        this.userService = userService;
    }
}
