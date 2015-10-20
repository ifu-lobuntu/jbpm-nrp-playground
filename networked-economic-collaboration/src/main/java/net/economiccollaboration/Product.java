/**Do not edit: generated from uml.*/
package net.economiccollaboration;
import net.economiccollaboration.ProductQuantityUnitOfMeasurement;
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
@Entity(name="Product")
@Table(name="product")
@Entity(name="Product")
@Table(name="product")
public class Product{
  @Id
  @GeneratedValue
  Long id;
  @Id
  @GeneratedValue
  Long id;
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="unit_of_measurement_id",referencedColumnName="id")}
  )
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="unit_of_measurement_id",referencedColumnName="id")}
  )
  private ProductQuantityUnitOfMeasurement unitOfMeasurement = null;
  public Product(){
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
  public ProductQuantityUnitOfMeasurement getUnitOfMeasurement(){
    ProductQuantityUnitOfMeasurement result = this.unitOfMeasurement;
    return result;
  }
  public void setUnitOfMeasurement(ProductQuantityUnitOfMeasurement newUnitOfMeasurement){
    this.unitOfMeasurement=newUnitOfMeasurement;
  }
}
