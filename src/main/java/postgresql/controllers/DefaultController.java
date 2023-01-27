package postgresql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import postgresql.models.Categories;
import postgresql.repository.CategoryRepository;

import java.util.Date;

@RestController
public class DefaultController implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String index() {
        return ("Index started listening at: " + new Date().toString());
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("HELLO WORLD");

//        for (int i = 1; i <= 10; ++i) {
//            Categories categories = new Categories("Category #" + i);
//            categoryRepository.save(categories);
//        }


    }



}
