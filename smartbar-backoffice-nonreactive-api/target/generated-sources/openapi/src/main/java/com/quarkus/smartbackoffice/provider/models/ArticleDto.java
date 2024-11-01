package com.quarkus.smartbackoffice.provider.models;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("articleDto")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-01T19:14:50.753222+01:00[Europe/Amsterdam]", comments = "Generator version: 7.8.0")@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.Data
@lombok.extern.jackson.Jacksonized

public class ArticleDto   {
  private Long id;
  private String name;
  private BigDecimal price;
  private String description;
  private String picture;

  /**
   **/
  public ArticleDto id(Long id) {
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
   * The name of the article
   **/
  public ArticleDto name(String name) {
    this.name = name;
    return this;
  }

  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The price of the article
   **/
  public ArticleDto price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @JsonProperty("price")
  @Valid public BigDecimal getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * A description of the article
   **/
  public ArticleDto description(String description) {
    this.description = description;
    return this;
  }

  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * URL to the picture of the article
   **/
  public ArticleDto picture(String picture) {
    this.picture = picture;
    return this;
  }

  
  @JsonProperty("picture")
  public String getPicture() {
    return picture;
  }

  @JsonProperty("picture")
  public void setPicture(String picture) {
    this.picture = picture;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleDto articleDto = (ArticleDto) o;
    return Objects.equals(this.id, articleDto.id) &&
        Objects.equals(this.name, articleDto.name) &&
        Objects.equals(this.price, articleDto.price) &&
        Objects.equals(this.description, articleDto.description) &&
        Objects.equals(this.picture, articleDto.picture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price, description, picture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleDto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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

