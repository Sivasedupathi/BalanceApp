package BalanceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerAccountService {
    @Autowired
    public CustomerAccountRepository accountRepository;
    @Autowired
    public CustomerRepository customerRepository;

    public Double getBalance(String id) {
        Double data = -1.0;

        if (customerRepository.existsById(id)) {
            return accountRepository.findById(id)
                    .map(CustomerAccount::getBalance)
                    .orElseThrow(() -> new RuntimeException("Account not found"));
        }
        return data;
    }

    public Customer insertCustomerIntoDatabase(Customer customer) {
        return customerRepository.save(customer);
    }
}