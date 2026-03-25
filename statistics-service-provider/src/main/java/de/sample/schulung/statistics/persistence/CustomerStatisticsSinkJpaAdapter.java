package de.sample.schulung.statistics.persistence;

import de.sample.schulung.statistics.domain.CustomerStatistics;
import de.sample.schulung.statistics.domain.CustomerStatisticsSinkPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Typed;

@ApplicationScoped
@Typed(CustomerStatisticsSinkPort.class)
public class CustomerStatisticsSinkJpaAdapter implements CustomerStatisticsSinkPort {

  private final CustomerEntityRepository repo;

  public CustomerStatisticsSinkJpaAdapter(
    CustomerEntityRepository repo
  ) {
    this.repo = repo;
  }

  @Override
  public CustomerStatistics getStatistics() {
    return repo.getStatistics();
  }

}
