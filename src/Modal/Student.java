package Modal;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    int idStudent;
    String nameStudent;
    int ageStudent;
    Date dateStudent;
    int telephoneStudent;
    String addressStudent;

    ClassCG classCG;


    public Student(int idStudent,String nameStudent, int ageStudent, Date dateStudent, int telephoneStudent, String addressStudent, ClassCG classCG) {
       this.idStudent =idStudent;
        this.nameStudent = nameStudent;
        this.ageStudent = ageStudent;
        this.dateStudent = dateStudent;
        this.telephoneStudent = telephoneStudent;
        this.addressStudent = addressStudent;
        this.classCG = classCG;
    }

    public int getIdStudent(){
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(int ageStudent) {
        this.ageStudent = ageStudent;
    }

    public Date getDateStudent() {
        return dateStudent;
    }

    public void setDateStudent(Date dateStudent) {
        this.dateStudent = dateStudent;
    }

    public int getTelephoneStudent() {
        return telephoneStudent;
    }

    public void setTelephoneStudent(int telephoneStudent) {
        this.telephoneStudent = telephoneStudent;
    }

    public String getAddressStudent() {
        return addressStudent;
    }

    public void setAddressStudent(String addressStudent) {
        this.addressStudent = addressStudent;
    }

    public ClassCG getClassCG() {
        return classCG;
    }

    public void setClassCG(ClassCG classCG) {
        this.classCG = classCG;
    }

    @Override
    public String toString() {
        DateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
        return  "idStudent:"+idStudent+
                "nameStudent:" + nameStudent +
                ", ageStudent:" + ageStudent +
                ", dateStudent:" + dateFormat.format(dateStudent) +
                ", telephoneStudent:" + telephoneStudent +
                ", addressStudent:" + addressStudent
                +classCG.toString();
    }
}
