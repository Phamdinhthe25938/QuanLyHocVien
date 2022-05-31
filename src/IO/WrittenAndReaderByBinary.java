package IO;

import Modal.Student;

import java.io.*;
import java.util.ArrayList;

public class WrittenAndReaderByBinary {
    public void write(ArrayList<Student> students) {
        File file = new File("Student.csv");
      try{
          FileOutputStream fileOutputStream = new FileOutputStream(file);
          ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
          objectOutputStream.writeObject(students);

          objectOutputStream.close();
          fileOutputStream.close();
      }
      catch (IOException e){
          e.printStackTrace();
      }
    }
    public ArrayList<Student> reader(){
        File file = new File("Student.csv");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Student>) objectInputStream.readObject();
        } catch (IOException  | ClassNotFoundException i) {
            System.out.println("Not data!");
        }
        return new ArrayList<>();
        }
    }
