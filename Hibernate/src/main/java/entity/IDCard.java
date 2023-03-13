package entity;

import javax.persistence.*;
import java.beans.Transient;
import java.util.Date;

@Entity
@Table(name = "Student_I_Card")
public class IDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long student_id;

    @Lob
    byte [] image;

    @Column(name = "student_address")
    String address;
    @Column(name = "Phone_No")
    Long phoneNo;

    @Column(name = "ICard_Issued_Date")
    @Temporal(TemporalType.DATE)
    Date icardIssueDate;


    public IDCard()
    {
        super();
    }
    public IDCard(Long student_id, byte[] image, String address, Long phoneNo, Date icardIssueDate) {
        this.student_id = student_id;
        this.image = image;
        this.address = address;
        this.phoneNo = phoneNo;
        this.icardIssueDate = icardIssueDate;
    }

    public Long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Long student_id) {
        this.student_id = student_id;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Date getIcardIssueDate() {
        return icardIssueDate;
    }

    public void setIcardIssueDate(Date icardIssueDate) {
        this.icardIssueDate = icardIssueDate;
    }




}
