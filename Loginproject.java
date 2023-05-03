package database;
import java.util.Scanner;
import java.sql.*;
public class javaproj {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        do {
	            System.out.println("1. New User Registration");
	            System.out.println("2. Login");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    registerUser();
	                    break;
	                case 2:
	                    loginUser();
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 3);
	    }

	    public static void registerUser() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter username: ");
	        String username = sc.nextLine();
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();
	        if (password.length() < 8) {
	            System.out.println("Password must be at least 8 characters long.");
	            return;
	        }
	        if (!password.matches(".*\\d.*")) {
	            System.out.println("Password must contain at least one digit.");
	            return;
	        }
	        if (!password.matches(".*[a-z].*")) {
	            System.out.println("Password must contain at least one lowercase letter.");
	            return;
	        }
	        if (!password.matches(".*[A-Z].*")) {
	            System.out.println("Password must contain at least one uppercase letter.");
	            return;
	        }
	        if (!password.matches(".*[!@#$%^&*()].*")) {
	            System.out.println("Password must contain at least one special character.");
	            return;
	        }
	        
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Kamali?characterEncoding=latin1","root","Kamalini123*");
	            PreparedStatement stmt = con.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)");
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            int i = stmt.executeUpdate();
	            if (i > 0) {
	                System.out.println("User registered successfully.");
	            } else {
	                System.out.println("Error registering user.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public static void loginUser() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter username: ");
	        String username = sc.nextLine();
	        System.out.print("Enter password: ");
	        String password = sc.nextLine();
	        
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Kamali?characterEncoding=latin1","root","Kamalini123*");
	            PreparedStatement stmt = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
	            stmt.setString(1, username);
	            stmt.setString(2, password);
	            ResultSet rs = stmt.executeQuery();
	            if (rs.next()) {
	                System.out.println("Login successful.");
	            } else {
	                System.out.println("Invalid username or password.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	}


