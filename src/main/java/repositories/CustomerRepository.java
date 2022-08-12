/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.List;
import java.util.Optional;
import models.Customer;

/**
 *
 * @author YYJCS
 */
public interface CustomerRepository {
    
    /**
     * Show the specified resource
     * @param nit
     * @return the customer with the first nit founded
     */
    Optional<Customer> get(String nit);
    
    /**
     * Store a new customer
     * @param customer
     * @return the recent customer created
     */
    Customer store(Customer customer);
}
