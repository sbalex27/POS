/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author alex2
 */
public class Product {
    private int id;
    private String code;
    private String name;
    private double price;
    private String codeBar;

    public Product(int id, String code, String name, double price, String codeBar) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.price = price;
        this.codeBar = codeBar;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the codeBar
     */
    public String getCodeBar() {
        return codeBar;
    }

    /**
     * @param codeBar the codeBar to set
     */
    public void setCodeBar(String codeBar) {
        this.codeBar = codeBar;
    }
}
