package postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postgresql.models.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Integer> {
}
