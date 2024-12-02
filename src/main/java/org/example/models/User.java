package ee.ivkhkdev.models;


public class User {
    private static long count = 1;
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String email;
    private String phone;

    public User() {
        this.id = this.count++;
    }

    public User(String name, String surname, int age, String email, String phone) {
        this.id = User.count++;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname + ", " + age + ", " + email + ", " + phone;
    }
}
