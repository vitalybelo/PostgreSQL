package postgresql.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import postgresql.repository.CategoryRepository;

import java.util.Date;

@RestController
public class DefaultController implements CommandLineRunner {

    @Autowired
    private CategoryRepository categories;
    private JdbcTemplate connection;

    @RequestMapping("/")
    public String index() {
        return ("Index started listening at: " + new Date().toString());
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("HELLO WORLD");

        //connection.execute("drop table if exists categories");
    }



}
