package animal;

public class Animal {
    //class fields:
    private String name;
    private int age;
    private String breed;

    //constructors:
    public Animal() {
    }

    public Animal(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    //getters an setters:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Ім'я тварини - " + name + '\n' +
                "Вік - " + age + '\n' +
                "Порода - " + breed+ '\n';
    }
}