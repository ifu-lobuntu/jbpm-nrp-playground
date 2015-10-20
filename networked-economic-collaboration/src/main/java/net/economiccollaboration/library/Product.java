/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import net.economiccollaboration.library.ProductUnitOfMeasurement;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Basic;
import javax.persistence.Column;
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
  @Basic()
  @Column(name="name")
  @Basic()
  @Column(name="name")
  private String name = "";
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="unit_of_measure_id",referencedColumnName="id")}
  )
  @OneToOne()
  @JoinColumns(value={
        @JoinColumn(name="unit_of_measure_id",referencedColumnName="id")}
  )
  private ProductUnitOfMeasurement unitOfMeasure = null;
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
  public String getName(){
    String result = this.name;
    return result;
  }
  public ProductUnitOfMeasurement getUnitOfMeasure(){
    ProductUnitOfMeasurement result = this.unitOfMeasure;
    return result;
  }
  public void setName(String newName){
    this.name=newName;
  }
  public void setUnitOfMeasure(ProductUnitOfMeasurement newUnitOfMeasure){
    this.unitOfMeasure=newUnitOfMeasure;
  }
}
