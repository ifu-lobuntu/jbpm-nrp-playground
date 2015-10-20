/**Do not edit: generated from uml.*/
package net.foodproduction.measures;
public enum GardenYieldPotential{
  MAXIMUM(null, false, null, false, 1.0),
  MEDIUM(null, false, null, false, 0.8),
  LOW(null, false, null, false, 0.6);
  private GardenYieldPotential(Double maximumEndpoint, Boolean maximumOpen, Double minimumEndpoint, Boolean minimumOpen, Double value){
    this.setMaximumEndpoint(maximumEndpoint);
    this.setMaximumOpen(maximumOpen);
    this.setMinimumEndpoint(minimumEndpoint);
    this.setMinimumOpen(minimumOpen);
    this.setValue(value);
  }
  private Double maximumEndpoint = null;
  private Boolean maximumOpen = false;
  private Double minimumEndpoint = null;
  private Boolean minimumOpen = false;
  private Double value = null;
  public Double getMaximumEndpoint(){
    Double result = this.maximumEndpoint;
    return result;
  }
  public Boolean getMaximumOpen(){
    Boolean result = this.maximumOpen;
    return result;
  }
  public Double getMinimumEndpoint(){
    Double result = this.minimumEndpoint;
    return result;
  }
  public Boolean getMinimumOpen(){
    Boolean result = this.minimumOpen;
    return result;
  }
  public Double getValue(){
    Double result = this.value;
    return result;
  }
  private void setMaximumEndpoint(Double newMaximumEndpoint){
    this.maximumEndpoint=newMaximumEndpoint;
  }
  private void setMaximumOpen(Boolean newMaximumOpen){
    this.maximumOpen=newMaximumOpen;
  }
  private void setMinimumEndpoint(Double newMinimumEndpoint){
    this.minimumEndpoint=newMinimumEndpoint;
  }
  private void setMinimumOpen(Boolean newMinimumOpen){
    this.minimumOpen=newMinimumOpen;
  }
  private void setValue(Double newValue){
    this.value=newValue;
  }
}
