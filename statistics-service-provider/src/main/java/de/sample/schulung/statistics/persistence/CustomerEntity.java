package de.sample.schulung.statistics.persistence;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.UUID;

@Entity(name = "Customer")
@Table(name = "CUSTOMERS")
public class CustomerEntity {

  @NotNull
  @Id
  private UUID uuid;
  private LocalDate dateOfBirth;

  public UUID getUuid() {
    return uuid;
  }

  public CustomerEntity setUuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public CustomerEntity setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

}
