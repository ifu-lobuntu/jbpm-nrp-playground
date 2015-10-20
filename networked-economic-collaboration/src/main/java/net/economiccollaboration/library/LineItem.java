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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity(name="LineItem")
@Table(name="line_item")
public class LineItem{
  @Id
  @GeneratedValue
  Long id;
  private Double LineItemPrice = null;
  private Double LineItemQuantity = null;
  @ManyToOne()
  @JoinColumns(value={
        @JoinColumn(name="order_id",referencedColumnName="id")}
  )
  private Order order = null;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="selected_product_id",referencedColumnName="id")}
  )
  private Product selectedProduct = null;
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
  public Double getLineItemPrice(){
    Double result = this.LineItemPrice;
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
  public Product getSelectedProduct(){
    Product result = this.selectedProduct;
    return result;
  }
  public void setLineItemPrice(Double newLineItemPrice){
    this.LineItemPrice=newLineItemPrice;
  }
  public void setLineItemQuantity(Double newLineItemQuantity){
    this.LineItemQuantity=newLineItemQuantity;
  }
  public void setOrder(Order newOrder){
    if(!(newOrder == null)){
      newOrder.getLineItems().add(this);
    } else {
      if(!(this.order == null)){
        this.order.getLineItems().remove(this);
      }
    }
    this.order=newOrder;
  }
  public void setSelectedProduct(Product newSelectedProduct){
    this.selectedProduct=newSelectedProduct;
  }
}
