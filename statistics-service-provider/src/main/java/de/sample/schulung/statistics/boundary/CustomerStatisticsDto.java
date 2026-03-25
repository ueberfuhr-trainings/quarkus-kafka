package de.sample.schulung.statistics.boundary;

import java.time.LocalDate;
import java.util.Objects;

public class CustomerStatisticsDto {

  private long count;
  private LocalDate earliestBirthdate;
  private LocalDate latestBirthdate;

  public long getCount() {
    return count;
  }

  public CustomerStatisticsDto setCount(long count) {
    this.count = count;
    return this;
  }

  public LocalDate getEarliestBirthdate() {
    return earliestBirthdate;
  }

  public CustomerStatisticsDto setEarliestBirthdate(LocalDate earliestBirthdate) {
    this.earliestBirthdate = earliestBirthdate;
    return this;
  }

  public LocalDate getLatestBirthdate() {
    return latestBirthdate;
  }

  public CustomerStatisticsDto setLatestBirthdate(LocalDate latestBirthdate) {
    this.latestBirthdate = latestBirthdate;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    CustomerStatisticsDto that = (CustomerStatisticsDto) o;
    return count == that.count && Objects.equals(earliestBirthdate, that.earliestBirthdate) && Objects.equals(latestBirthdate, that.latestBirthdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, earliestBirthdate, latestBirthdate);
  }

  @Override
  public String toString() {
    return "CustomerStatisticsDto{" +
      "count=" + count +
      ", earliestBirthdate=" + earliestBirthdate +
      ", latestBirthdate=" + latestBirthdate +
      '}';
  }

}
