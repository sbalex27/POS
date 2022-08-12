/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.List;
import models.Product;

/**
 *
 * @author alex2
 */
public interface ProductRepository {
    /**
     * Find an specific product resource
     * @param id
     * @return a product resource
     */
    Product get(int id);
}
