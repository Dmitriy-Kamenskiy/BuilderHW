public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) throws IllegalStateException {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Должно быть не пустое поле!!!");
        } else {
            this.name = name;
        }
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalStateException {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Должно быть не пустое поле!!!");
        } else {
            this.surname = surname;
        }
        return this;
    }

    public PersonBuilder setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Должна быть положительное значение!!!");
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Должно быть не пустое поле!!!");
        }
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("Должно быть не пустое поле!!!");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Должна быть положительное значение!!!");
        }
        return new Person(name, surname, age, address);
    }
}
