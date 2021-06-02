package models;

public class Customer {
    private String name;
    private String birthday;
    private String gender;
    private String numberIDCard;
    private String phoneNumbers;
    private String email;
    private String customerType;
    private String address;

    public Customer() {
    }

    public Customer(String name, String birthday, String gender, String numberIDCard, String phoneNumbers, String email, String customerType, String address) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.numberIDCard = numberIDCard;
        this.phoneNumbers = phoneNumbers;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumberIDCard() {
        return numberIDCard;
    }

    public void setNumberIDCard(String numberIDCard) {
        this.numberIDCard = numberIDCard;
    }

    public String getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  name +
                "#"+ birthday +
                "#" + gender +
                "#" + numberIDCard +
                "#" + phoneNumbers +
                "#" + email +
                "#" + customerType +
                "#" + address;
    }

    public String showInfor() {
        return "Customer { " +
                " Name : '" + name + '\'' +
                ", Birthday : '" + birthday + '\'' +
                ", Gender : '" + gender + '\'' +
                ", CMND : '" + numberIDCard + '\'' +
                ", Telephone : '" + phoneNumbers + '\'' +
                ", Email : '" + email + '\'' +
                ", Level : '" + customerType + '\'' +
                ", Address : '" + address + '\'' +
                '}';
    }
}
