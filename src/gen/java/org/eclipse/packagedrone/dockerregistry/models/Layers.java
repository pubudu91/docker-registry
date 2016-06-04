package org.eclipse.packagedrone.dockerregistry.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.packagedrone.dockerregistry.models.LayersFsLayers;






public class Layers   {
  
  private String name = null;
  private String tag = null;
  private List<LayersFsLayers> fsLayers = new ArrayList<LayersFsLayers>();
  private String history = null;
  private String signature = null;

  /**
   **/
  public Layers name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public Layers tag(String tag) {
    this.tag = tag;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  /**
   **/
  public Layers fsLayers(List<LayersFsLayers> fsLayers) {
    this.fsLayers = fsLayers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("fsLayers")
  public List<LayersFsLayers> getFsLayers() {
    return fsLayers;
  }
  public void setFsLayers(List<LayersFsLayers> fsLayers) {
    this.fsLayers = fsLayers;
  }

  /**
   **/
  public Layers history(String history) {
    this.history = history;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("history")
  public String getHistory() {
    return history;
  }
  public void setHistory(String history) {
    this.history = history;
  }

  /**
   **/
  public Layers signature(String signature) {
    this.signature = signature;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("signature")
  public String getSignature() {
    return signature;
  }
  public void setSignature(String signature) {
    this.signature = signature;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Layers layers = (Layers) o;
    return Objects.equals(name, layers.name) &&
        Objects.equals(tag, layers.tag) &&
        Objects.equals(fsLayers, layers.fsLayers) &&
        Objects.equals(history, layers.history) &&
        Objects.equals(signature, layers.signature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, tag, fsLayers, history, signature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Layers {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    fsLayers: ").append(toIndentedString(fsLayers)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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

