/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 * Product class contains simple attributes for a real product
 */
public class Product {
    
    private String name;
    private String price;
    private String availNum;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Return a string representation of product this product,
     * the exact details of representation are unspecified and
     * subject to change.
     * 
     * @return Name of product
     */
    // Always override toString method inherit from Object
    @Override
    public String toString() {
        return name;
    }
}
