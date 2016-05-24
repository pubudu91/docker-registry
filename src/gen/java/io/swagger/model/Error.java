package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorErrors;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class Error   {
  
  private List<ErrorErrors> errors = new ArrayList<ErrorErrors>();

  
  /**
   **/
  public Error errors(List<ErrorErrors> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("errors")
  public List<ErrorErrors> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorErrors> errors) {
    this.errors = errors;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(errors, error.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

