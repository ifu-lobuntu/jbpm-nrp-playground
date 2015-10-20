/**Do not edit: generated from uml.*/
package net.economiccollaboration;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="ProductQuantityUnitOfMeasurement")
@Table(name="product_quantity_unit_of_measurement")
@Entity(name="ProductQuantityUnitOfMeasurement")
@Table(name="product_quantity_unit_of_measurement")
public class ProductQuantityUnitOfMeasurement{
  @Id
  @GeneratedValue
  Long id;
  @Id
  @GeneratedValue
  Long id;
  public ProductQuantityUnitOfMeasurement(){
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
}
