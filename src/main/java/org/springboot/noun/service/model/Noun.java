
 package org.springboot.noun.service.model;

 import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

 @Entity
public class Noun implements Serializable
{
  private static final long serialVersionUID = 5429363222735167394L;

  private String noun;
  @Id
  @Column(length = 40, updatable = false, nullable = false)
  private String nounId;
  
  public Noun() {}
  
  public Noun(String nounId,String noun)
  {
    this.noun = noun;
  }
  
  public String getNoun() {
    return noun;
  }
  
  public Noun noun(String noun) {
    this.noun = noun;
    return this;
  }
  
  public boolean equals(Object o)
  {
    if (this == o) return true;
    if ((o == null) || (getClass() != o.getClass())) return false;
    Noun noun1 = (Noun)o;
    return Objects.equals(noun, noun);
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { noun });
  }
  
  public String toString()
  {
    StringBuffer sb = new StringBuffer("Noun{");
    sb.append("noun='").append(noun).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
 
 
   

