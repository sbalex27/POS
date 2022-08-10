/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.List;
import models.Customer;

/**
 *
 * @author alex2
 */
public interface CustomerRepository {
    
    /**
     * Show the specified resource
     * @param id
     * @return the customer with the same id
     */
    Customer get(int id);
    
    /**
     * Index a list of customers
     * @return all the customers in a list
     */
    List<Customer> index();
    
    /**
     * Store a new customer
     * @param customer
     * @return the recent customer created
     */
    Customer store(Customer customer);
}
