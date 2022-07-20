package Lesson10.Task1;

public class PhoneBookRecord {
 final private String name;
 final private String  phone;
 final private String adress;

    public PhoneBookRecord(String name, String phone, String adress) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return adress;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAndSurname='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
