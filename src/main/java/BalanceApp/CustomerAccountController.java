package BalanceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerAccountController {

    @Autowired
    private CustomerAccountService service;

    @GetMapping("/balance/{id}")
    public Double getBalance(@PathVariable Long id) {
        return service.getBalance(id);
    }

    @PostMapping("/balance/register")
    public Customer insertCustomerInDb(@RequestBody Customer customer) {
        return  service.insertCustomerIntoDatabase(customer);
    }

}