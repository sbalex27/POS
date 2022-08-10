/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.List;
import models.Customer;

/**
 *
 * @author alex2
 */
public class InMemoryCustomerRepository implements CustomerRepository {
    private final List<Customer> data;

    public InMemoryCustomerRepository(List<Customer> data) {
        this.data = data;
    }
    
    @Override
    public Customer get(int id) {
        return data.stream()
                .filter(customer -> customer.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Customer> index() {
        return data;
    }

    @Override
    public Customer store(Customer customer) {
        data.add(customer);
        return customer;
    }
}
