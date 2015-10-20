/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import net.economiccollaboration.library.Order;
import java.util.Set;
import java.util.HashSet;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
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
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="date_time_created")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="date_time_created")
  private Date dateTimeCreated = null;
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="date_time_submitted")
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name="date_time_submitted")
  private Date dateTimeSubmitted = null;
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
  public Date getDateTimeCreated(){
    Date result = this.dateTimeCreated;
    return result;
  }
  public Date getDateTimeSubmitted(){
    Date result = this.dateTimeSubmitted;
    return result;
  }
  public Set<Order> getOrders(){
    Set<Order> result = this.orders;
    return result;
  }
  public void setDateTimeCreated(Date newDateTimeCreated){
    this.dateTimeCreated=newDateTimeCreated;
  }
  public void setDateTimeSubmitted(Date newDateTimeSubmitted){
    this.dateTimeSubmitted=newDateTimeSubmitted;
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
