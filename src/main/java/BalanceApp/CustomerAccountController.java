package BalanceApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerAccountController {

    @Autowired
    private CustomerAccountService service;

//    @GetMapping("/balance/{id}")
//    public Double getBalance(@PathVariable Long id) {
//        return service.getBalance(id);
//    }

    @GetMapping("/balance/{id}")
    public ResponseEntity<Object> getBalance(@PathVariable Long id) {
        Double data = service.getBalance(id);
        if (data != -1.0) {
            return ResponseHandler.generateResponse("Successfully retrieved data!", HttpStatus.OK, data);
        } else {
            return ResponseHandler.generateResponse("Customer not registered!", HttpStatus.INTERNAL_SERVER_ERROR, data);
        }

    }

//    @PostMapping("/balance/register")
//    public Customer insertCustomerInDb(@RequestBody Customer customer) {
//        return  service.insertCustomerIntoDatabase(customer);
//    }

    @PostMapping("/balance/register")
    public ResponseEntity<Object> insertCustomerInDb(@RequestBody Customer customer) {
        Customer data =  service.insertCustomerIntoDatabase(customer);
        return ResponseHandler.generateResponse("Successfully registered!", HttpStatus.OK, data);
    }

}