package animal;

public class Dog extends Animal {
    private int tailLength; //inches

    public Dog(String name, int age, String breed, int tailLength) {
        super(name, age, breed);
        this.tailLength = tailLength;
        this.setAge(age);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age * 2);
    }

    @Override
    public String toString() {
        return "Ім'я тварини - " + getName() + '\n' +
                "Вік - " + getAge() + '\n' +
                "Порода - " + getBreed()+ '\n' +
                "Довжина хвоста - " + tailLength;
    }
}
