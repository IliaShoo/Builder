public class Person {
    protected final String name;
    protected final String surname;
    protected Integer age;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public boolean hasAge() {
        if (age != null)
            return true;
        else return false;
    }

    public boolean hasAdress() {
        if (city != null) {
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public void setAddress(String address) {
        address = city;
    }

    public void happyBirthday() {
        if (hasAge() == true) {
            age++;
        }
    }

    @Override
    public String toString() {
        return getName() + " " + getSurname() + " " + getAge() + " " + getAddress();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().
                setSurname(getSurname()).
                setAddress(getAddress());
    }

}
