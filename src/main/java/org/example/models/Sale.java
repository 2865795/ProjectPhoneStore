package ee.ivkhkdev.models;

import java.io.Serializable;

public class Sale {
    private static long count = 1;
    private Long id;
    private User user;
    private Phone phone;

    public Sale() {
        this.id = this.count++;
    }

    public Sale(User user, Phone phone) {
        this.id = Sale.count++;
        this.user = user;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String toString() {
        return id + ". " + "Покупатель: " + user.toString()+ " Телефон: " + phone.toString();
    }
}
