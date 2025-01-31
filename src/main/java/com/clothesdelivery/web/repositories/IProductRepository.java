package com.clothesdelivery.web.repositories;

import com.clothesdelivery.web.entities.Product;
import com.clothesdelivery.web.enums.Category;
import com.clothesdelivery.web.enums.GenreStyle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
    Product findByFriendlyUrl(String friendlyUrl);
    List<Product> findByGenreStyleOrCategory(GenreStyle style, Category category);
}
