package ie.atu.week4_lab_cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    List<Product> productList= new ArrayList<>();

    @GetMapping("/getProducts")
    public List<Product> getProducts()

    {
        return productList;
    }

    @PostMapping("/addProduct")
    public List<Product> addProduct(@RequestBody Product product)
    {
        productList.add(product);
        return productList;
    }

}
