package com.semihonay.anuglarspringboot.controllers;

import com.semihonay.anuglarspringboot.models.ProductModel;
import com.semihonay.anuglarspringboot.repositories.ProductRepository;
import org.jboss.logging.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Product controller.
 */
@RestController
@CrossOrigin
@RequestMapping(name = "Product Controller", path = "/api/v1/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductController {

  private final static Logger LOGGER = Logger.getLogger(ProductController.class.getName());
  private ProductRepository repository;

  /**
   * Instantiates a new Product controller.
   *
   * @param repository the repository
   */
  public ProductController(ProductRepository repository) {
    this.repository = repository;
  }

  /**
   * Gets all products.
   *
   * @return the all products
   */
  @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<ProductModel> getAllProducts() {
    return this.repository.findAll();
  }

  /**
   * Gets product by id.
   *
   * @param productId the product ıd
   * @return the product by ıd
   */
  @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ProductModel getProductById(@PathVariable(value = "id") Long productId) {
    return this.repository.findById(productId).get();
  }

  /**
   * Create product.
   *
   * @param body the body
   */
  @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public String createProduct(@RequestBody ProductModel body) {
    return this.repository.save(body).toString();
  }

  @PatchMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public String updateProduct(@PathVariable(value = "id") Long productId, @RequestBody String body) {
    return this.repository.findById(productId).get().toString();
  }
}
