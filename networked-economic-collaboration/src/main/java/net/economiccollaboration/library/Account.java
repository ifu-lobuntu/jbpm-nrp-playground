/**Do not edit: generated from uml.*/
package net.economiccollaboration.library;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity(name="Account")
@Table(name="account")
public class Account{
  @Id
  @GeneratedValue
  Long id;
  public Account(){
  }
  public Long getId(){
    return this.id;
  }
  public void setId(Long value){
    this.id=value;
  }
}
