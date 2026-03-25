package de.sample.schulung.accounts.boundary;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.util.UUID;

public class CustomerDto {

  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
  private UUID uuid;
  @NotNull
  @Size(min = 3, max = 100)
  private String name;
  @JsonProperty("birthdate")
  @NotNull
  private LocalDate dateOfBirth;
  private CustomerStateDto state = CustomerStateDto.ACTIVE;

  public UUID getUuid() {
    return uuid;
  }

  public CustomerDto setUuid(UUID uuid) {
    this.uuid = uuid;
    return this;
  }

  public String getName() {
    return name;
  }

  public CustomerDto setName(String name) {
    this.name = name;
    return this;
  }

  public LocalDate getDateOfBirth() {
    return dateOfBirth;
  }

  public CustomerDto setDateOfBirth(LocalDate dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public CustomerStateDto getState() {
    return state;
  }

  public CustomerDto setState(CustomerStateDto state) {
    this.state = state;
    return this;
  }

  public enum CustomerStateDto {
    ACTIVE("active"),
    LOCKED("locked"),
    DISABLED("disabled");

    private final String value;

    CustomerStateDto(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }
  }

}
