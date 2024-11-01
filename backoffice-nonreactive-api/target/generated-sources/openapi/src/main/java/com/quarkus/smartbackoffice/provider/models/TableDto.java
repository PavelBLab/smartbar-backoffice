package com.quarkus.smartbackoffice.provider.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("tableDto")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-01T19:22:24.263246+01:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.Data
@lombok.extern.jackson.Jacksonized

public class TableDto   {
  private Long id;
  private String name;
  private Integer seatCount;
  private Boolean active;

  /**
   **/
  public TableDto id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Table name
   **/
  public TableDto name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Number of seats at the table
   **/
  public TableDto seatCount(Integer seatCount) {
    this.seatCount = seatCount;
    return this;
  }

  
  @JsonProperty("seatCount")
  @NotNull public Integer getSeatCount() {
    return seatCount;
  }

  @JsonProperty("seatCount")
  public void setSeatCount(Integer seatCount) {
    this.seatCount = seatCount;
  }

  /**
   * Table status
   **/
  public TableDto active(Boolean active) {
    this.active = active;
    return this;
  }

  
  @JsonProperty("active")
  @NotNull public Boolean getActive() {
    return active;
  }

  @JsonProperty("active")
  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableDto tableDto = (TableDto) o;
    return Objects.equals(this.id, tableDto.id) &&
        Objects.equals(this.name, tableDto.name) &&
        Objects.equals(this.seatCount, tableDto.seatCount) &&
        Objects.equals(this.active, tableDto.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, seatCount, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seatCount: ").append(toIndentedString(seatCount)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

