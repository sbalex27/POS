/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;

/**
 *
 * @author alex2
 */
public class SqlCustomerRepository implements CustomerRepository {

    private final Connection connection;
    
    public SqlCustomerRepository(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public Optional<Customer> get(String nit) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM clientes WHERE nit = ? LIMIT 1");
            statement.setString(1, nit);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(new Customer(
                        resultSet.getInt("id"),
                        resultSet.getString("nit"),
                        resultSet.getString("nombre")
                ));
            } else {
                return Optional.empty();
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlCustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return Optional.empty();
        } 
    }
    
    @Override
    public Customer store(Customer customer) {
        try {
            String sql = "INSERT INTO clientes (nit, nombre) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, customer.getNit());
            statement.setString(2, customer.getName());
            statement.executeUpdate();
            return customer;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlCustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
