package IO;

import Modal.ClassCG;

import java.io.*;
import java.util.ArrayList;

public class WrittenAndReadClassCG {
    public void write(ArrayList<ClassCG> classCG){
        File file = new File("ClassCG1.csv");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(classCG);
            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e){
            System.out.println("Not file!");
        }
    }
    public ArrayList<ClassCG> reader(){
        File file =new File("ClassCG1.csv");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<ClassCG>) objectInputStream.readObject();
        }
        catch (IOException | ClassNotFoundException i) {
            System.out.println("File not!");
        }
        return  new ArrayList<>();
    }
}
