public abstract class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    // Абстрактный метод, который будет реализован в подклассах
    public abstract void bark();

    // Общий метод для всех собак
    public void eat() {
        System.out.println(name + " ест корм.");
    }
}

