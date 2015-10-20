/**Do not edit: generated from uml.*/
package net.foodproduction;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="Garden")
@Table(name="garden")
public class Garden{
  @Id
  @GeneratedValue
  Long id;
  public Garden(){
  }
  public Long getId(){
    return this.id;
  }
  public void setId(Long value){
    this.id=value;
  }
}
