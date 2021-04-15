/*
 * CS3810 - Principles of Database Systems - Spring 2021
 * Instructor: Thyago Mota
 * Description: DB 03 - Student
 * Student(s) Name(s): Malcolm Johnson
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
	@Id
	private int code;
	@OneToMany(mappedBy = "code")
	private List<Student> students;
	private int max;
	private int actual;
	private String title;
	private String instructor;
	private String description;
	@Override public String toString() {
		return "Course{" +
	"code=" + code +
	", students=" + students +
	", max=" + max +
	", actual=" + actual +
	", title='" + title + '\'' +
	", instructor='" + instructor + '\'' +
	", descrip='" + description + '\'' +
	'}';
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String descrip) {
		description = descrip;
	}
}