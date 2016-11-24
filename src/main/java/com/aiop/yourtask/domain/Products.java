/*
 * 
 */
package com.aiop.yourtask.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Products.
 */
@SuppressWarnings("serial")
public class Products extends ArrayList<Product>{
   
   /**
    * Instantiates a new products.
    */
   public Products() { }

   /**
    * Gets the products.
    *
    * @return the products
    */
   @XmlElement(name = "Product")
   public List<Product> getProducts() {
       return this;
   }
}
