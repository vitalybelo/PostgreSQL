package postgresql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import postgresql.models.Categories;
import postgresql.models.Products;
import postgresql.repository.CategoryRepository;

import java.util.Date;

@RestController
public class DefaultController implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String index() {
        return ("Index started listening at: " + new Date());
    }

    @Override
    public void run(String... args) {

        System.out.println("HELLO WORLD");
        for (int x = 1; x <= 5; ++x) {
            Categories category = new Categories("Category #" + x);
            for (int y = 1; y <= 5; ++y) {
                Products product = new Products("Product #" + y, 100.00, category);
                category.addProduct(product);
            }
            categoryRepository.save(category);
        }
    }



}
