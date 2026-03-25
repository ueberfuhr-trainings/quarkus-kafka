package de.sample.schulung.statistics.domain;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerStatisticsService {

  private final CustomerStatisticsSinkPort customerStatisticsSink;

  public CustomerStatisticsService(
    CustomerStatisticsSinkPort customerStatisticsSink
  ) {
    this.customerStatisticsSink = customerStatisticsSink;
  }

  public CustomerStatistics getStatistics() {
    return customerStatisticsSink.getStatistics();
  }

}
