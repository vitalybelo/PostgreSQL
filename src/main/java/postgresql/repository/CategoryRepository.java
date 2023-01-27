package postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import postgresql.models.Categories;

public interface CategoryRepository extends JpaRepository<Categories, Integer> {

}
