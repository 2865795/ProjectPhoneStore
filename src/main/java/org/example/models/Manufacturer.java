package ee.ivkhkdev.models;

public class Manufacturer {
    private static long count = 1;
    private Long id;
    private String name;
    private String country;

    public Manufacturer() {
        this.id = this.count++;
    }

    public Manufacturer(String name, String country) {
        this.id = Manufacturer.count++;
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return id + ". " + name + " (" + country + ")";
    }
}

