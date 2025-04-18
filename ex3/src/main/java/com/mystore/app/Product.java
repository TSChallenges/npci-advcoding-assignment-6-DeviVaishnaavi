package com.mystore.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // ✅ Make Product class Spring-managed

public class Product {
    
    private int id;
    private String name;
    private String barcode;

    private Barcode barCoder;

    // ✅ Step 1: Constructor with @Autowired (Constructor Injection)
    @Autowired	

    public Product(Barcode barCoder) {
        this.barCoder = barCoder;
	System.out.println("In Product constructor");
    }

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBarcode() {
        this.barcode = barCoder.createBarcode(this);
    }



    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBarcode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Product{id=" + id + ", name='" + name + "', barcode='" + barcode + "'}";
    }

}
