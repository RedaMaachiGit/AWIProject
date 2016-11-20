package com.aiop.yourtask.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("serial")
public class Products extends ArrayList<Product>{
   public Products() { }

   @XmlElement(name = "Product")
   public List<Product> getProducts() {
       return this;
   }
}
