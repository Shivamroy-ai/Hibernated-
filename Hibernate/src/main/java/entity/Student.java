package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Student_Detail")
public class Student {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String studentName;

    Long rollNo;
    private  Certificate certificate;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", rollNo=" + rollNo +
                ", certificate=" + certificate +
                '}';
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Student(Long id, String studentName, Long rollNo) {
        this.id = id;
        this.studentName = studentName;
        this.rollNo = rollNo;
    }
  public  Student()
  {

  }
    public Long getId() {
        return id;
    }

    public String getStudentName() {
        return studentName;
    }

    public Long getRollNo() {
        return rollNo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return id.equals(student.id) && studentName.equals(student.studentName) && rollNo.equals(student.rollNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentName, rollNo);
    }

}
