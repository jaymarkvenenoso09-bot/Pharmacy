/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marie Arlene
 */
public class LoggedInUser {
    public static int id;
    public static String firstName;
    public static String lastName;
    public static String email;

    // Optional: clear user on logout
    public static void logout() {
        id = 0;
        firstName = null;
        lastName = null;
        email = null;
    }
    
}
