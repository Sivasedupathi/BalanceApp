package BalanceApp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "customer_account")
public class CustomerAccount {

    @Id
    private String cardNo;
    private String name;
    private Double balance;

    public String getId() {
        return cardNo;
    }

    public String getName() {
        return name;
    }

    public Double getBalance() {
        return balance;
    }
}