package org.example;

public class Cat implements Animal{

    private String name;
    private String age;

    public Cat() {
    }

    public Cat(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public void animalPlus() {
        System.out.println("It's cats method plus");
    }

    @Override
    public void animalMinus() {
        System.out.println("it's cats method minus");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
