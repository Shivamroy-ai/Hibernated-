package entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class Certificate {
    @Column(name = "caurse_name")
    private  String caurseName;
    @Temporal(TemporalType.DATE)
    private Date caurseDuration;

    public Certificate()
    {
        super();
    }
    public Certificate(String caurseName, Date caurseDuration) {
        this.caurseName = caurseName;
        this.caurseDuration = caurseDuration;
    }

    public String getCaurseName() {
        return caurseName;
    }

    public void setCaurseName(String caurseName) {
        this.caurseName = caurseName;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "caurseName='" + caurseName + '\'' +
                ", caurseDuration=" + caurseDuration +
                '}';
    }

    public Date getCaurseDuration() {
        return caurseDuration;
    }

    public void setCaurseDuration(Date caurseDuration) {
        this.caurseDuration = caurseDuration;
    }
}
