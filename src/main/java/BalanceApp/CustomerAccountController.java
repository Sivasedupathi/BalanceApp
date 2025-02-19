package BalanceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerAccountController {

    Double balance = 0.00;

    @Autowired
    private CustomerAccountService service;

    @GetMapping("/balance/{id}")
    public Double getBalance(@PathVariable Long id) {
        try{
            balance = service.getBalance(id);
        }catch (Exception e) {
            System.out.println("Exception error");
        }
        return balance;
    }

}