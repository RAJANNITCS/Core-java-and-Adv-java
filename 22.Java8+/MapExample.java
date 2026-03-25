// WAP to demostrating map operation 

import java.util.*;
import java.util.stream.Collectors;

class Product {
    public String productName;
    public double productPrice;

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return this.productName;
    }

}
public class MapExample {
    public static void main(String[] args) {
        List<Product> sCart = Arrays.asList(new Product("Laptop", 150000)
                            ,new Product("mouse", 250));

        List<String> prodDropdownList = sCart.stream().map(product -> product.getProductName()).map(String :: toUpperCase).collect(Collectors.toList());

        System.out.println("Dropdown list = " + prodDropdownList);
    }
}
