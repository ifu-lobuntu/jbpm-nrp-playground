/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="ProductUnitOfMeasurement")
@Table(name="product_unit_of_measurement")
@Entity(name="ProductUnitOfMeasurement")
@Table(name="product_unit_of_measurement")
public class ProductUnitOfMeasurement{
  @Id
  @GeneratedValue
  Long id;
  @Id
  @GeneratedValue
  Long id;
  @Basic()
  @Column(name="name")
  @Basic()
  @Column(name="name")
  private String name = "";
  public ProductUnitOfMeasurement(){
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
  public String getName(){
    String result = this.name;
    return result;
  }
  public void setName(String newName){
    this.name=newName;
  }
}
