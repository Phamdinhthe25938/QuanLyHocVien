package Validate;

import java.util.Scanner;

public class ValidateStudent {
    Scanner sc = new Scanner(System.in);
    public  boolean validateFullName(String fullName) {
        String[] number = {"0", "1", "2", "3"," 4", "5", "6", "8", "9"};
        for (int i=0;i<fullName.length();i++){
            for(int j=0;j<number.length;j++){
                if(Character.toString(fullName.charAt(i)).equals(number[j])){
                    return false;
                }
            }
        }
        return true;
    }
    public int validateAgeStudent(){
        try {
            System.out.println("Input Student age:");
            int ageStudent= Integer.parseInt(sc.nextLine());
            if(ageStudent>0){
                return ageStudent;
            }
            throw new Exception();
        }
        catch (Exception e){
            return validateAgeStudent();
        }
    }
    public int validateIdStudent(){
        try {
            System.out.println("Input student id:");
            int idStudent= Integer.parseInt(sc.nextLine());
            if(idStudent>0){
                return idStudent;
            }
            throw new Exception();
        }
        catch (Exception e){
            return validateIdStudent();
        }
    }
    public int validateTelephoneStudent(){
        try {
            System.out.println("Input student telephone number:");
            int validateTelephoneStudent= Integer.parseInt(sc.nextLine());
            if(validateTelephoneStudent>0){
                return validateTelephoneStudent;
            }
            throw new Exception();
        }
        catch (Exception e){
            return validateTelephoneStudent();
        }
    }
    public  int validateDateDay(){
        try {
            System.out.println("Input student date of birth: ");
            int dateDayStudent = Integer.parseInt(sc.nextLine());
            if(1<=dateDayStudent && dateDayStudent<=31){
                return dateDayStudent;
            }
            throw  new Exception();
        }
        catch (Exception e){
            return validateDateDay();
        }
    }
    public  int validateMonth(){
        try {
            System.out.println("Input your month of birth:");
            int dateMonthStudent = Integer.parseInt(sc.nextLine());
            if(0<dateMonthStudent && dateMonthStudent<=12){
                return dateMonthStudent;
            }
            throw  new Exception();
        }
        catch (Exception e){
            return validateMonth();
        }
    }
    public int validateYear(){
        try {
            System.out.println("Input student year of birth:");
            int dateYearStudent = Integer.parseInt(sc.nextLine());
            if(dateYearStudent>1900){
                return dateYearStudent;
            }
            throw  new Exception();
        }
        catch (Exception e){
            return validateYear();
        }
    }
}
