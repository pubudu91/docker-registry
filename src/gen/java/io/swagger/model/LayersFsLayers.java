package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-24T22:16:54.859+05:30")
public class LayersFsLayers   {
  
  private String blobSum = null;

  
  /**
   **/
  public LayersFsLayers blobSum(String blobSum) {
    this.blobSum = blobSum;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("blobSum")
  public String getBlobSum() {
    return blobSum;
  }
  public void setBlobSum(String blobSum) {
    this.blobSum = blobSum;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LayersFsLayers layersFsLayers = (LayersFsLayers) o;
    return Objects.equals(blobSum, layersFsLayers.blobSum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blobSum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LayersFsLayers {\n");
    
    sb.append("    blobSum: ").append(toIndentedString(blobSum)).append("\n");
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

