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
