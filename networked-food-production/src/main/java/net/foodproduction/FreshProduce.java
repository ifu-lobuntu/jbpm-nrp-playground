/**Do not edit: generated from uml.*/
package net.foodproduction;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="FreshProduce")
@Table(name="fresh_produce")
public class FreshProduce{
  @Id
  @GeneratedValue
  Long id;
  public FreshProduce(){
  }
  public Long getId(){
    return this.id;
  }
  public void setId(Long value){
    this.id=value;
  }
}
