package BalanceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerAccountService {
    @Autowired
    public CustomerAccountRepository repository;

    public Double getBalance(Long id) {
        return repository.findById(id)
                .map(CustomerAccount::getBalance)
                .orElseThrow(() -> new RuntimeException("Account not found"));
    }
}