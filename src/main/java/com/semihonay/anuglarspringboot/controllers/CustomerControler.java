package com.semihonay.anuglarspringboot.controllers;

import com.semihonay.anuglarspringboot.models.CustomerModel;
import com.semihonay.anuglarspringboot.repositories.CustomerRepository;
import java.util.List;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The type Customer RestControler.
 */
@RestController
@CrossOrigin
@RequestMapping(name = "Customer Controller", path = "/api/v1/customers", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerControler {

  private final static Logger log = Logger.getLogger(CustomerControler.class.getName());
  private CustomerRepository repository;

  /**
   * Instantiates a new Customer controler.
   *
   * @param repository the repository
   */
  public CustomerControler(CustomerRepository repository) {
    this.repository = repository;
  }

  /**
   * Gets all customers.
   *
   * @return the all customers
   */
  @GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public List<CustomerModel> getAllCustomers() {
    return repository.findAll();
  }

  /**
   * Gets customer by ıd.
   *
   * @param customerId the customer ıd
   * @return Single customer data
   */
  @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
  public CustomerModel getCustomerById(@PathVariable(value = "id") Long customerId) {
    return this.repository.getOne(customerId);
  }

  /**
   * Create customer customer model.
   *
   * @param newModel the new CustomerModel
   * @return the customer model
   */
  @PostMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public String createCustomer(@Validated @RequestBody CustomerModel newModel) {
    return repository.save(newModel).toString();
  }

  /**
   * Patch customer response entity.
   *
   * @param objects the objects
   * @return the response entity
   */
  @PatchMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity patchCustomer(@RequestBody Object objects) {
    return new ResponseEntity(HttpStatus.NO_CONTENT);

  }

  /**
   * Update customer response entity.
   *
   * @param objects the objects
   * @return the response entity
   */
  @PutMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity updateCustomer(@RequestBody Object objects) {
    return new ResponseEntity(HttpStatus.NO_CONTENT);
  }
}
