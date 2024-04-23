package bdd.finalProject.utility;

public class DataProvider {

    public String getRandomEmail() {
        String name = "Amina";
        String email = "@gmail.com";
        String num = "";
        for (int i = 0; i <= 4; i++) {
            num += (int) (Math.random() * 10);
        }
        return name + num + email;
    }
}

/*
EXPLANATION:
This Java class, named DataProvider, provides a utility method to generate a random email address.

1. getRandomEmail(): This method generates a random email address by concatenating a name, a random number, and an email
   domain.

    - It starts with a fixed name "Amina".
    - It generates a random number by looping 5 times and appending a random digit (between 0 and 9) to the number string.
    - It appends the email domain "@(link unavailable)" to the name and number.

The resulting email address will be in the format "AminaXXXXX@(link unavailable)", where XXXXX is a random 5-digit number.
This method can be used to generate unique email addresses for testing purposes.
 */