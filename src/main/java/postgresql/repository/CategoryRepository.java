package postgresql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import postgresql.models.Categories;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Integer> {
}
