package auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import auth.domain.product.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
}
