package ru.mirea.task17;
import java.util.Scanner;

enum Game {
    Unknown, GodOfWar, HorizonZeroDawn, TLOU, Uncharted, GTA;
}

public class Task17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = Game.Unknown;
        String s;
        System.out.println("Выберите игру (серию игр):");

        for (Game g: Game.values()) {
            if(g.ordinal() != 0)
                System.out.println(g.ordinal()+". "+g);
        }
        int p = in.nextInt();
        for (Game g: Game.values()) {
            if (p == g.ordinal())
                game = Game.valueOf(g.name());
        }

        System.out.println("Выбрано: "+game.name());
    }
}
