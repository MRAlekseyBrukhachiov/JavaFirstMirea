package ru.mirea.task3.opt2;

import java.util.Arrays;

public class Human {
    private char gender;
    private String name;
    private int age;
    private Head head;
    private Leg[] legs = new Leg[2];
    private Hand[] hands = new Hand[2];

    public Human(char gender, String name, int age, int iq, int sizeLeg) {
        this.gender = gender;
        this.name = name;
        this.age = age;
        head = new Head(iq);
        for (int i = 0; i < 2; i++) {
            legs[i] = new Leg(sizeLeg);
        }
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                hands[i] = new Hand(true);
            }
            else {
                hands[i] = new Hand(false);
            }
        }
    }

    public Hand getHand(boolean chooseHand) {
        if (chooseHand)
            return hands[0];
        else
            return hands[1];
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

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

    public void setIq(int iq) {
        this.head.setIq(iq);
    }

    public int getIq() {
        return head.getIq();
    }

    public void setSizeLeg(int sizeLeg) {
        for (Leg leg: legs) {
            leg.setSize(sizeLeg);
        }
    }

    public int getSizeLeg() {
        return legs[0].getSize();
    }

    @Override
    public String toString() {
        return ((gender == 'M')?"Male ":"Female ")+age+" years. Name: "+
                name+". Level iq = "+this.getIq()+". Shoe size: "+this.getSizeLeg();
    }
}
