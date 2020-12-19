package builder;

public class Customer {
    private int id;
    private String name;
    private String phone;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phoneString) {
        this.phone = phoneString;
    }

    public String getPhone() {
        return phone;
    }
}
