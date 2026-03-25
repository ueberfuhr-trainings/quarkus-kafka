package de.sample.schulung.accounts.domain;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public class Customer {

  public enum CustomerState {
    ACTIVE, LOCKED, DISABLED
  }

  private UUID uuid;
  @Size(min = 3, max = 100)
  private String name;
  private LocalDate dateOfBirth;
  private CustomerState state;

  public UUID getUuid() {
    return uuid;
  }

  public Customer setUuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getName() {
    return name;
  }

  public Customer setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public Customer setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public CustomerState getState() {
    return state;
  }

  public Customer setState(CustomerState state) {
    this.state = state;
    return this;
  }
}
