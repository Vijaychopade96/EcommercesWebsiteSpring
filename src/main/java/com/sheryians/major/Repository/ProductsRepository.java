package com.sheryians.major.Repository;

import com.sheryians.major.model.Product;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Product,Long> {

    List<Product> findAllByCategory_Id(int id);
}
