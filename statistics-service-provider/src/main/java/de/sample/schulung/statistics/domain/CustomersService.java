package de.sample.schulung.statistics.domain;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.UUID;

@ApplicationScoped
public class CustomersService {

  private final CustomersSinkPort customersSink;

  public CustomersService(
    CustomersSinkPort customersSink
  ) {
    this.customersSink = customersSink;
  }

  public void saveCustomer(Customer customer) {
    customersSink.saveCustomer(customer);
  }

  public void deleteCustomer(UUID uuid) {
    customersSink.deleteCustomer(uuid);
  }

  public long count() {
    return customersSink.count();
  }

}
