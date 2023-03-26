package com.zakat.finance_app.controller;

import com.zakat.finance_app.model.Account;
import com.zakat.finance_app.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController extends BasicController<Account, Long> {
    private final AccountService accountService;

    protected AccountController(AccountService accountService) {
        super(accountService);
        this.accountService = accountService;
    }
}
