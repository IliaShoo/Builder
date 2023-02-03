public class PersonBuilder {

    String name;
    String surName;
    int age;
    String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;

    }

    public PersonBuilder setSurname(String surname) {
        this.surName = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Enter correct age");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surName == null) {
            throw new IllegalStateException("Enter name and(or) surname");
        }
        return new Person(this.name, this.surName, this.age, this.address);
    }

}
