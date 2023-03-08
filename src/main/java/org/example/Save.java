package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Save {

    public static void saveContacts(ArrayList<Contacts> contacts){
    try{
        FileOutputStream fos = new FileOutputStream("contacts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(contacts);
        oos.close();
        fos.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }

}
