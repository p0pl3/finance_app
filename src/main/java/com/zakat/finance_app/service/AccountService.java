package com.zakat.finance_app.service;

import com.zakat.finance_app.model.Account;
import com.zakat.finance_app.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends BasicService<Account, Long> {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        super(accountRepository);
        this.accountRepository = accountRepository;
    }
}
