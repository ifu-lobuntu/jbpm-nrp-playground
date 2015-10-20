/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import net.economiccollaboration.library.LineItem;
import net.economiccollaboration.library.ShoppingBasket;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
  private Double OrderPrice = null;
  @OneToMany(mappedBy="order",cascade=CascadeType.ALL)
  @OneToMany(mappedBy="order",cascade=CascadeType.ALL)
  private Set<LineItem> lineItems = new HashSet<LineItem>();
  @ManyToOne()
  @JoinColumns(value={
        @JoinColumn(name="shopping_basket_id",referencedColumnName="id")}
  )
  @ManyToOne()
  @JoinColumns(value={
        @JoinColumn(name="shopping_basket_id",referencedColumnName="id")}
  )
  private ShoppingBasket shoppingBasket = null;
  public Order(){
  }
  public Order(ShoppingBasket owner){
  this.setShoppingBasket(owner);
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
  public Set<LineItem> getLineItems(){
    Set<LineItem> result = this.lineItems;
    return result;
  }
  public Double getOrderPrice(){
    Double result = this.OrderPrice;
    return result;
  }
  public ShoppingBasket getShoppingBasket(){
    ShoppingBasket result = this.shoppingBasket;
    return result;
  }
  public void setLineItems(Set<LineItem> newLineItems){
    Set<LineItem> oldValues = new HashSet<LineItem>();
    oldValues.addAll(this.lineItems);
    for(LineItem cur : oldValues){
      cur.setOrder(null);
    }
    if(!(newLineItems == null)){
      for(LineItem cur : newLineItems){
        cur.setOrder(this);
      }
    }
  }
  public void setOrderPrice(Double newOrderPrice){
    this.OrderPrice=newOrderPrice;
  }
  public void setShoppingBasket(ShoppingBasket newShoppingBasket){
    if(!(newShoppingBasket == null)){
      newShoppingBasket.getOrders().add(this);
    } else {
      if(!(this.shoppingBasket == null)){
        this.shoppingBasket.getOrders().remove(this);
      }
    }
    this.shoppingBasket=newShoppingBasket;
  }
}
