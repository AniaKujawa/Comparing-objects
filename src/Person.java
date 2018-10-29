
public class Person {
    private String name;
    private int id;
    private Gender gender;

    public Person() {
    }

    public Person(String name, int id, Gender gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void Welcome(){
        System.out.println("Hi!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        Person otherPerson = (Person) other;
        return this.name.equals(otherPerson.name) &&
                this.id == otherPerson.id &&
                this.gender == otherPerson.gender;
    }
}