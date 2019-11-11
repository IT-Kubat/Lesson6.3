package com.company;

public abstract class Animal {

    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void makeVoice();


}
