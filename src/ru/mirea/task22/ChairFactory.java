package ru.mirea.task22;

public class ChairFactory {

    public Chair createChair (ChairType type) {
        Chair chair = null;

        switch (type) {
            case MagicChair:
                chair = new MagicChair();
                break;
            case MultifunctionalChair:
                chair = new MultifunctionalChair();
                break;
            case VictorianChair:
                chair = new VictorianChair();
                break;
        }

        return chair;
    }
}
