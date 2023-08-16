package com.sheryians.major.Service;

import com.sheryians.major.Repository.ProductsRepository;
import com.sheryians.major.model.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductsRepository productsRepository;

    public List<Product> getAllProduct(){
        return productsRepository.findAll();
    }
    public void addProduct(Product product){
        productsRepository.save(product);

    }
    public void removeProductById(long id){
        productsRepository.deleteById(id);

    }
    public Optional<Product>getProductById(long id){
        return productsRepository.findById(id);
    }
    public List<Product> getAllProductsByCategoryId(int id){
        return productsRepository.findAllByCategory_Id(id);

    }



}
