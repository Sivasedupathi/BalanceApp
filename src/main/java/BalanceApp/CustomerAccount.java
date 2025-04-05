package BalanceApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer_account")
public class CustomerAccount {

    @Id
    private Long cardNo;
    private String name;
    private Double balance;

    public Long getId() {
        return cardNo;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }
}