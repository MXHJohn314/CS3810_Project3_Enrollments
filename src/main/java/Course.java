/*
 * CS3810 - Principles of Database Systems - Spring 2021
 * Instructor: Thyago Mota
 * Description: DB 03 - Student
 * Student(s) Name(s): Matt Hurt, Malcolm Johnson, Adam Wojdyla
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "courses")
public class Course implements Serializable {
	@Id
	private String code;
	private int max;
	private int actual;
	private String title;
	private String instructor;
	@Override public String toString() {
		return "Course{" +
	"code=" + code +
	", title='" + title + '\'' +
	", instructor='" + instructor + '\'' +
	", max=" + max +
	", actual=" + actual +
	'}';
	}
	
	public String getCode() {
		return code;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public int getActual() {
		return actual;
	}
	
	public void setActual(int actual) {
		this.actual = actual;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getInstructor() {
		return instructor;
	}
	
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	//public String getDescription() {
	//	return description;
	//}
	
	//public void setDescription(String descrip) {
	//	description = descrip;
	//}
}
