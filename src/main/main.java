package main;

import Controller.ManagerStudent;
import IO.WrittenAndReadClassCG;

public class main {
    public static void main(String[] args) {
        ManagerStudent managerStudent = new ManagerStudent();
        while (true){
            managerStudent.menu();
        }
    }
}
