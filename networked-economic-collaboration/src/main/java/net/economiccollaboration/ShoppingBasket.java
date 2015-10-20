/**Do not edit: generated from uml.*/
package net.economiccollaboration;
import net.economiccollaboration.Order;
import java.util.Set;
import java.util.HashSet;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity(name="ShoppingBasket")
@Table(name="shopping_basket")
@Entity(name="ShoppingBasket")
@Table(name="shopping_basket")
public class ShoppingBasket{
  @Id
  @GeneratedValue
  Long id;
  @Id
  @GeneratedValue
  Long id;
  @OneToMany(mappedBy="shoppingBasket",cascade=CascadeType.ALL)
  @OneToMany(mappedBy="shoppingBasket",cascade=CascadeType.ALL)
  private Set<Order> orders = new HashSet<Order>();
  public ShoppingBasket(){
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
  public Set<Order> getOrders(){
    Set<Order> result = this.orders;
    return result;
  }
  public void setOrders(Set<Order> newOrders){
    Set<Order> oldValues = new HashSet<Order>();
    oldValues.addAll(this.orders);
    for(Order cur : oldValues){
      cur.setShoppingBasket(null);
    }
    if(!(newOrders == null)){
      for(Order cur : newOrders){
        cur.setShoppingBasket(this);
      }
    }
  }
}
