package BalanceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerAccountService {
    @Autowired
    public CustomerAccountRepository accountRepository;
    @Autowired
    public CustomerRepository customerRepository;

    public Double getBalance(Long id) {
        if (customerRepository.existsById(id)) {
            return accountRepository.findById(id)
                    .map(CustomerAccount::getBalance)
                    .orElseThrow(() -> new RuntimeException("Account not found"));
        } else {
            throw new RuntimeException("Please register");
        }

    }

    public Customer insertCustomerIntoDatabase(Customer customer) {
        return customerRepository.save(customer);
    }
}