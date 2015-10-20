/**Do not edit: generated from uml.*/
package net.foodproduction;
import net.foodproduction.measures.GardenYieldPotential;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="Garden")
@Table(name="garden")
public class Garden{
  @Id
  @GeneratedValue
  Long id;
  private Double GardenSize = null;
  @Enumerated()
  private GardenYieldPotential GardenYieldPotential = null;
  private Double ProjectedMaximumYield = null;
  private Double ProjectedYield = null;
  public Garden(){
  }
  public Long getId(){
    return this.id;
  }
  public void setId(Long value){
    this.id=value;
  }
  public Double getGardenSize(){
    Double result = this.GardenSize;
    return result;
  }
  public GardenYieldPotential getGardenYieldPotential(){
    GardenYieldPotential result = this.GardenYieldPotential;
    return result;
  }
  public Double getProjectedMaximumYield(){
    Double result = this.ProjectedMaximumYield;
    return result;
  }
  public Double getProjectedYield(){
    Double result = this.ProjectedYield;
    return result;
  }
  public void setGardenSize(Double newGardenSize){
    this.GardenSize=newGardenSize;
  }
  public void setGardenYieldPotential(GardenYieldPotential newGardenYieldPotential){
    this.GardenYieldPotential=newGardenYieldPotential;
  }
  public void setProjectedMaximumYield(Double newProjectedMaximumYield){
    this.ProjectedMaximumYield=newProjectedMaximumYield;
  }
  public void setProjectedYield(Double newProjectedYield){
    this.ProjectedYield=newProjectedYield;
  }
}
