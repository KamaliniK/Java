//Write a program to create customised exception to validate your mail id.
  class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidator {
    public static void validateEmail(String email) throws InvalidEmailException {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!email.matches(regex)) {
            throw new InvalidEmailException("Invalid email address");
        }
    }

    public static void main(String[] args) {
        String email = "example@example.com";
        try {
            validateEmail(email);
            System.out.println(email + " is a valid email address");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
