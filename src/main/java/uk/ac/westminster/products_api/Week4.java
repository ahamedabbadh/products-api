package uk.ac.westminster.products_api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Week4 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("Abbadh");
        ls.add("Fawzer");
        ls.add("Harry");

        List<Product> Products = new ArrayList<>();
        Products.add(new Product(3L,"Mug",8.50));

        Map<Long,Product> byId = new HashMap<>();
    }
}
