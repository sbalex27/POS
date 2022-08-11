/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.List;
import java.util.Optional;
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
    public Optional<Customer> get(String nit) {
        return data.stream()
                .filter(customer -> customer.getNit().equals(nit))
                .findFirst();
    }
    
    @Override
    public Customer store(Customer customer) {
        data.add(customer);
        return customer;
    }
}
