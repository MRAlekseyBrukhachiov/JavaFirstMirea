package ru.mirea.task2;
import java.util.Arrays;
public class TestDog {
    public Dog[] addDog(Dog[] org, Dog added) {
        Dog[] result = Arrays.copyOf(org, org.length +1);
        result[org.length] = added;
        return result;
    }
}
