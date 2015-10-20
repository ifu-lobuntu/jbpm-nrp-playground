/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import net.economiccollaboration.library.Order;
import net.economiccollaboration.library.Product;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
@Entity(name="LineItem")
@Table(name="line_item")
@Entity(name="LineItem")
@Table(name="line_item")
public class LineItem{
  @Id
  @GeneratedValue
  Long id;
  @Id
  @GeneratedValue
  Long id;
  private Double LineItemQuantity = null;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="end2_name_id",referencedColumnName="id")}
  )
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="end2_name_id",referencedColumnName="id")}
  )
  private Product end2Name = null;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="order_id",referencedColumnName="id")}
  )
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="order_id",referencedColumnName="id")}
  )
  private Order order = null;
  public LineItem(){
  }
  public LineItem(Order owner){
  this.setOrder(owner);
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
  public Product getEnd2Name(){
    Product result = this.end2Name;
    return result;
  }
  public Double getLineItemQuantity(){
    Double result = this.LineItemQuantity;
    return result;
  }
  public Order getOrder(){
    Order result = this.order;
    return result;
  }
  public void setEnd2Name(Product newEnd2Name){
    this.end2Name=newEnd2Name;
  }
  public void setLineItemQuantity(Double newLineItemQuantity){
    this.LineItemQuantity=newLineItemQuantity;
  }
  public void setOrder(Order newOrder){
    Order oldValue = this.order;
    if(( newOrder == null || !(newOrder.equals(oldValue)) )){
      this.order=newOrder;
      if(!(oldValue == null)){
        oldValue.setEnd2Name(null);
      }
      if(!(newOrder == null)){
        if(!(this.equals(newOrder.getEnd2Name()))){
          newOrder.setEnd2Name(this);
        }
      }
    }
  }
}
