package postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import postgresql.models.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
}
