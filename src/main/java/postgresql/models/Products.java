package postgresql.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false)
    private Categories category;

    @Column(nullable = false, length = 100)
    private String product_name;

    @Column(nullable = false, precision = 2)
    private Double product_price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "categories_category_id")
    private Categories categories;

}
