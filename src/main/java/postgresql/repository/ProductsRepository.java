package postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postgresql.models.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
}
