package ru.mirea.task27.opt1;

import java.util.HashMap;
import java.util.Map;

public class Task27 {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();

        names.put("Брюхачёв", "Алексей");
        names.put("Баженов", "Никита");
        names.put("Шаронов", "Владимир");
        names.put("Кутепов", "Андрей");
        names.put("Шундалов", "Шамиль");
        names.put("Булава", "Всеволод");
        names.put("Никитин", "Олег");
        names.put("Удалов", "Алексей");
        names.put("Вяльчинов", "Кирилл");
        names.put("Беляков", "Евгений");

        System.out.println(names);

        Map<String,Integer> count = new HashMap<>();
        for (Map.Entry<String,String> entry: names.entrySet()) {
            if (count.containsKey(entry.getValue())) {
                count.put(entry.getValue(), count.get(entry.getValue()) + 1);
            } else {
                count.put(entry.getValue(), 1);
            }
        }
        for (Map.Entry<String,String> entry: new HashMap<>(names).entrySet()) {
            if (count.get(entry.getValue()) > 1) {
                names.remove(entry.getKey());
            }
        }
        System.out.println(names);
    }
}
