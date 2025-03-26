package entities;

public class Client {

    String name;
    String email;
    String birthDate;

    public Client() {
    }

    public Client(String name, String email, String birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override

    public String toString() {
        return "Client: " + this.name + " (" + this.birthDate + ") - " + this.email;
    }
}
