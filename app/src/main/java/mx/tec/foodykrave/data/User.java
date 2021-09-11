package mx.tec.foodykrave.data;

import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String id, email, name, account_type;
    private boolean verified;

    public User(){ }

    public User(String id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.verified = false;
        this.account_type = "CLIENT";
    }

    public User(String id, String email, String name, boolean verified, String account_type) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.verified = verified;
        this.account_type = account_type;
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVerified() {
        return this.verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public String getAccount_type() {
        return this.account_type;
    }

    public String toString() {
        return "id = " + this.getId() + ", email = " + this.getEmail() +
                ", name = " + this.getName() + ", verified = " + this.isVerified() +
                ", account_type = " + this.getAccount_type();
    }

    public static boolean isEmailValid(String email) {
        if (email == null) {
            return false;
        } else if (email.contains("@")) {
            return Patterns.EMAIL_ADDRESS.matcher(email).matches();
        } else {
            return !email.trim().isEmpty();
        }
    }

    public static boolean isNameValid(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isPasswordValid(String password) {
        Pattern digits = Pattern.compile("\\d+"),
                letters = Pattern.compile("[a-zA-Z]+");
        Matcher digitsMatcher = digits.matcher(password),
                lettersMatcher = letters.matcher(password);
        boolean hasAlphaNum = digitsMatcher.find() && lettersMatcher.find();
        return password.trim().length() >= 8 && hasAlphaNum;
    }
}
