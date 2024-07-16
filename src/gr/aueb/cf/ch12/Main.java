package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = new User(25, "Dimitris", "Baltas");
        UserCredentials  userCredentials = new UserCredentials(26, "@@Dimitris", "Pass123456");


        System.out.println("User Id:" + user.getId()  + ", "  + "User firstname: " + user.getFirstName() + ", "  + "User lastname: " + user.getLastName());
        System.out.println("User Id:" + userCredentials.getId() + ", " + "Username: " + userCredentials.getUsername() + ", " + "Password: " + userCredentials.getPassword());





    }
}
