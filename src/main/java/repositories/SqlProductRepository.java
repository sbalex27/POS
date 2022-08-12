/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Product;

/**
 *
 * @author alex2
 */
public class SqlProductRepository implements ProductRepository {

    private final Connection connection;

    public SqlProductRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Product get(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM productos where ID = ? LIMIT 1");
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            
            resultSet.next();
            
            return new Product(
                    resultSet.getInt("id"),
                    resultSet.getString("codigo"),
                    resultSet.getString("nombre"),
                    resultSet.getDouble("precio"),
                    resultSet.getString("codbarras")
            );
        } catch (SQLException ex) {
            Logger.getLogger(SqlProductRepository.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
