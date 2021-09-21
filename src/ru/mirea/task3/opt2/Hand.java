package ru.mirea.task3.opt2;

public class Hand {
    private boolean chooseHand;
    public Hand(boolean chooseHand) {
        this.chooseHand = chooseHand;
    }

    public boolean isChooseHand() {
        return chooseHand;
    }

    public void setChooseHand(boolean chooseHand) {
        this.chooseHand = chooseHand;
    }

    @Override
    public String toString() {
        return (chooseHand ? "Right" : "Left")+" hand";
    }
}
