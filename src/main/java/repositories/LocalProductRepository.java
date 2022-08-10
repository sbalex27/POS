/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.util.List;
import models.Product;

/**
 *
 * @author alex2
 */
public class LocalProductRepository implements ProductRepository {

    public LocalProductRepository(List<Product> data) {
        this.data = data;
    }
    
    private final List<Product> data;
    
    @Override
    public Product get(int id) {
        return data.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @Override
    public List<Product> index() {
        return data;
    }
}