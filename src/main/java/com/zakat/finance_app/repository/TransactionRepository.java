package com.zakat.finance_app.repository;

import com.zakat.finance_app.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}