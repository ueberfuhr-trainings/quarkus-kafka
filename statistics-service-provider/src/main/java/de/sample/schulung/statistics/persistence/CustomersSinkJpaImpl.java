package de.sample.schulung.statistics.persistence;

import de.sample.schulung.statistics.domain.Customer;
import de.sample.schulung.statistics.domain.CustomersSinkPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Typed;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@ApplicationScoped
@Typed(CustomersSinkPort.class)
@RequiredArgsConstructor
public class CustomersSinkJpaImpl implements CustomersSinkPort {

  private final CustomerEntityRepository repo;
  private final CustomerEntityMapper mapper;

  @Override
  public void saveCustomer(Customer customer) {
    var customerEntity = mapper.map(customer);
    if (customerEntity.getUuid() == null) {
      this.repo.persist(customerEntity);
    } else {
      this.repo.getEntityManager().merge(customerEntity);
    }
  }

  @Override
  public void deleteCustomer(UUID uuid) {
    repo.deleteById(uuid);
  }

  @Override
  public long count() {
    return repo.count();
  }
}
