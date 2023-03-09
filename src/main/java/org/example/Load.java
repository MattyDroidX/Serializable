package org.example;

import java.io.*;
import java.util.ArrayList;

public class Load {

    public static String loadContacts(){

        StringBuilder retrievedContacts = new StringBuilder();
        try{
            FileInputStream fis = new FileInputStream("contacts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Contacts> contactsList = (ArrayList<Contacts>) ois.readObject();
            ois.close();
            fis.close();
            for (Contacts contact : contactsList) {
                retrievedContacts.append(contact).append("\n");
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return retrievedContacts.toString();
    }
}
