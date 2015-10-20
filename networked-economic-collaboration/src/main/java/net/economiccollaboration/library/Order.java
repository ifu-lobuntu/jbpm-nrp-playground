/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import net.economiccollaboration.library.LineItem;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity(name="Order")
@Table(name="order")
@Entity(name="Order")
@Table(name="order")
public class Order{
  @Id
  @GeneratedValue
  Long id;
  @Id
  @GeneratedValue
  Long id;
  @OneToOne(mappedBy="order",cascade=CascadeType.ALL)
  @OneToOne(mappedBy="order",cascade=CascadeType.ALL)
  private LineItem end2Name = null;
  public Order(){
  }
  public Long getId(){
    return this.id;
  }
  public void setId(Long value){
    this.id=value;
  }
  public Long getId(){
    return this.id;
  }
  public void setId(Long value){
    this.id=value;
  }
  public LineItem getEnd2Name(){
    LineItem result = this.end2Name;
    return result;
  }
  public void setEnd2Name(LineItem newEnd2Name){
    LineItem oldValue = this.end2Name;
    if(( newEnd2Name == null || !(newEnd2Name.equals(oldValue)) )){
      this.end2Name=newEnd2Name;
      if(!(oldValue == null)){
        oldValue.setOrder(null);
      }
      if(!(newEnd2Name == null)){
        if(!(this.equals(newEnd2Name.getOrder()))){
          newEnd2Name.setOrder(this);
        }
      }
    }
  }
}
