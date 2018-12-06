/**
 * 
 */
package com.in28minutes.springboot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.in28minutes.springboot.model.Feedback;

/**
 * @author minda
 *
 */
@Entity
@Table(name="APP_FEEDBACK")
public class Feedback implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3328129348325226819L;
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NAME", nullable=false)
	private String name;
	
	@Column(name="VILLAGE", nullable=false)
	private String village;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the village
	 */
	public String getVillage() {
		return village;
	}
	/**
	 * @param village the village to set
	 */
	public void setVillage(String village) {
		this.village = village;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Feedback Feedback = (Feedback) o;

//		if (Double.compare(Feedback.salary, salary) != 0) return false;
//		if (id != null ? !id.equals(Feedback.id) : Feedback.id != null) return false;
//		if (name != null ? !name.equals(Feedback.name) : Feedback.name != null) return false;
//		return age != null ? age.equals(Feedback.age) : Feedback.age == null;
		return id != null ? id.equals(Feedback.id) : Feedback.id == null;
	}

	@Override
	public int hashCode() {
		int result;
//		long temp;
		result = id != null ? id.hashCode() : 0;
//		result = 31 * result + (name != null ? name.hashCode() : 0);
//		result = 31 * result + (age != null ? age.hashCode() : 0);
//		temp = Double.doubleToLongBits(salary);
//		result = 31 * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", village=" + village+ "]";//, salary=" + salary + "
	}
}
