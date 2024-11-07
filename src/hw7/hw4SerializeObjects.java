package hw7;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
    private static final long serialVersionUID = 1L;

    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Serializable {
    private static final long serialVersionUID = 1L;

    public void speak() {
        System.out.println("Meow!");
    }
}

public class hw4SerializeObjects {

    public static void main(String[] args) {
        try {
            File directory = new File("C:/data");
            if (!directory.exists()) {
                directory.mkdirs();
            }

            FileOutputStream fos = new FileOutputStream("C:/data/Object.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(new Dog());
            oos.writeObject(new Dog());
            oos.writeObject(new Cat());
            oos.writeObject(new Cat());

            oos.close();
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
