package ru.netology;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public boolean hasAge() {
        return age != -1;
    }
    public boolean hasAddress() {
        return address != null;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void happyBirthday() {
        if(hasAge()){
            age ++;
        }
    }

    @Override
    public String toString() {
        return "\nИмя - " + name
                + "\n" + "Фамилия - " + surname
                + "\n" + "Возраст - " + age
                + "\n" + "Адрес - " + address
                + "\n";
    }
    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(surname)
                .setAge(0)
                .setAddress(address);
    }

}