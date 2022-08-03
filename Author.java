package Package;

import java.time.Period;

public class Author {
    private String name;
    private String email ;



    public void Person(String name, String email) {
        this.name=name;
        this.email = email;

    }

    public  String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email=email;
    }

    public  String getEmail() {
        return email;
    }




    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + "\'" +
                ", email='" + email + "\'" +
                '}';
    }

}
