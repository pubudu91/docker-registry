package org.eclipse.packagedrone.dockerregistry.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






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

