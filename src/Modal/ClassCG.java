package Modal;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassCG implements Serializable {
//    private int idClass;
    private String nameClasCG;
    private Date startStudy;
    private String course;
    private int quantityStudent;
    private int currentQuantity;

    public ClassCG() {
    }

    public ClassCG(String nameClasCG, Date startStudy, String course,int currentQuantity, int quantityStudent) {
//        this.idClass=idClass;
        this.nameClasCG = nameClasCG;
        this.startStudy = startStudy;
        this.course = course;
        this.currentQuantity=currentQuantity;
        this.quantityStudent = quantityStudent;
    }

    public int getCurrentQuantity() {
        return currentQuantity;
    }

    public void setCurrentQuantity(int currentQuantity) {
        this.currentQuantity = currentQuantity;
    }

    public String getNameClasCG() {
        return nameClasCG;
    }

    public void setNameClasCG(String nameClasCG) {
        this.nameClasCG = nameClasCG;
    }

    public Date getStartStudy() {
        return startStudy;
    }

    public void setStartStudy(Date startStudy) {
        this.startStudy = startStudy;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getQuantityStudent() {
        return quantityStudent;
    }

    public void setQuantityStudent(int quantityStudent) {
        this.quantityStudent = quantityStudent;
    }

    @Override
    public String toString() {
        DateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
        return " nameClasCG:" + nameClasCG+
                ", startStudy:" + dateFormat.format(startStudy)+
                ", course:" + course +
                ",currentQuantity:"+currentQuantity+
                ", quantityStudent:" + quantityStudent ;
    }
}
