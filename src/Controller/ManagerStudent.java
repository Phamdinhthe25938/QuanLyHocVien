package Controller;

import IO.WrittenAndReadClassCG;
import IO.WrittenAndReaderByBinary;
import Modal.ClassCG;
import Modal.Student;
import Validate.ValidateStudent;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class ManagerStudent {
    WrittenAndReaderByBinary writtenAndReaderByBinary = new WrittenAndReaderByBinary();
    WrittenAndReadClassCG writtenAndReadClassCG = new WrittenAndReadClassCG();
    Scanner sc = new Scanner(System.in);
    ValidateStudent validateStudent = new ValidateStudent();
    ArrayList<Integer> choiceClassList = new ArrayList<>();
    ArrayList<ClassCG> classCGS = new  ArrayList<>();

    ArrayList<Student> studentList = new ArrayList<>();
    public ManagerStudent() {
        classCGS = writtenAndReadClassCG.reader();
        classCGS.add(new ClassCG("C0322g1", new Date("22/2/2222"), "Java",0, 28));
        classCGS.add(new ClassCG("C0322g2", new Date("1/1/2022"), "PHP",0, 20));
        classCGS = writtenAndReadClassCG.reader();
        studentList=writtenAndReaderByBinary.reader();
    }
    public void menu() {
        System.out.println("Menu");
        System.out.println("1. Add new students");
        System.out.println("2. Display all students");
        System.out.println("3. Display student by class");
        System.out.println("4.Delete student:");
        System.out.println("5.Add new class.");
        System.out.println("6.Display all class!");
        try {
            System.out.println("Enter your select :");
            int choice = Integer.parseInt(sc.nextLine());
            if(choice>0 && choice<=6){
                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        displayStudent();
                        break;
                    case 3:
                        displayStudentByClass();
                        break;
                    case 4:
                        deleteStudent();
                        break;
                    case 5:
                        addCLass();
                        break;
                    case 6:
                        displayAllClass();
                        break;
                }
            }
            else
                throw new RuntimeException();
        }
        catch (NumberFormatException e){

        }
        catch (RuntimeException e){
            System.out.println("Again enter!");
        }
    }
    public ClassCG creatClass(){
        System.out.println("Enter name class:");
        String nameClass = sc.nextLine();
        System.out.println("Enter day start open class:");
        int dayStartOpenClass= Integer.parseInt(sc.nextLine());
        System.out.println("Enter month start open class:");
        int monthStartOpenClass= Integer.parseInt(sc.nextLine());
        System.out.println("Enter year start open class:");
        int yearStartOpenClass = Integer.parseInt(sc.nextLine());
        System.out.println("Enter course name :");
        String nameCourse = sc.nextLine();
        System.out.println("Enter quantity student :");
        int quantityStudent= Integer.parseInt(sc.nextLine());
        System.out.println("Enter current quantity:");
        int currentQuantity= Integer.parseInt(sc.nextLine());
        return new ClassCG(nameClass,new Date(yearStartOpenClass-1900,monthStartOpenClass-1,dayStartOpenClass),nameCourse,currentQuantity,quantityStudent);
    }
    public void addCLass(){
        classCGS.add(creatClass());
        writtenAndReadClassCG.write(classCGS);
    }
    public void displayAllClass(){
        for(int i=0;i<classCGS.size();i++){
            System.out.println(classCGS.get(i));
        }
    }
    public Student  creatStudent(){
        int idStudent= validateStudent.validateIdStudent();
        String fullName=" ";
        while (true){
            System.out.println("Input full name of you:");
            fullName = sc.nextLine();
            if(validateStudent.validateFullName(fullName)){
                break;
            }
        }
        int ageStudent = validateStudent.validateAgeStudent();
        int dateDayStudent = validateStudent.validateDateDay();
        int dateMonthStudent = validateStudent.validateMonth();
        int dateYearStudent = validateStudent.validateYear();
        int phoneStudent = validateStudent.validateTelephoneStudent();
        System.out.println("Enter address student :");
        String addressStudent = sc.nextLine();
        for(int i=0;i<classCGS.size();i++){
            System.out.println("   "+(i+1)+" "+classCGS.get(i).getNameClasCG()+" "+classCGS.get(i).getCourse());
        }
        System.out.println("Choose a class for students:");
        int choice = Integer.parseInt(sc.nextLine());
        choiceClassList.add((choice-1));
        return new Student(idStudent,fullName,ageStudent,new Date(dateYearStudent-1900,dateMonthStudent-1,dateDayStudent),phoneStudent,addressStudent,classCGS.get(choice-1));
    }
    public void addStudent(){
        studentList.add(creatStudent());
//        writtenAndReaderByBinary.write(studentList);

    }
    public  void displayStudent(){
        for(int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
    }
    public void deleteStudent(){
        System.out.println("Enter id student you want delete:");
        int idDeleteStudent = Integer.parseInt(sc.nextLine());
        for(int i=0;i<studentList.size();i++){
           if(studentList.get(i).getIdStudent()==idDeleteStudent){
               studentList.remove(i);
           }
        }
        writtenAndReaderByBinary.write(studentList);
    }
    public void displayStudentByClass(){
        System.out.println("Enter name class but you want display student of that class: ");
        String nameClassFind = sc.nextLine();
        for(int i=0;i<studentList.size();i++){
            if(studentList.get(i).getClassCG().getCourse().equals(nameClassFind)){
                System.out.println(studentList.get(i));
            }
        }
    }
}
