package com.zakat.finance_app.service;

import com.zakat.finance_app.model.Transaction;
import com.zakat.finance_app.repository.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends BasicService<Transaction, Long> {
    private final TransactionRepository transactionRepository;

    protected TransactionService(TransactionRepository transactionRepository) {
        super(transactionRepository);
        this.transactionRepository = transactionRepository;
    }
}
