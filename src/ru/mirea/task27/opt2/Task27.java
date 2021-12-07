package ru.mirea.task27.opt2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Task27 {
    public static void main(String[]args) {
        Map<String, ArrayList<String>> countries = new HashMap<>();
        Map<String, String> cities = new HashMap<>();

        City moscow = new City("Moscow","Russia");
        City st = new City("St. Petersburg","Russia");
        City kuznetsk = new City("Kuznetsk","Russia");
        City manchester = new City("Manchester","UK");
        City liverpool = new City("Liverpool","UK");
        City london = new City("London","UK");
        City prague = new City("Prague","Czech Republic");
        City brno = new City("Brno","Czech Republic");
        City olomouc = new City("Olomouc","Czech Republic");

        countries.put("Russia", new ArrayList<>());
        countries.get("Russia").add(moscow.getCity());
        countries.get("Russia").add(st.getCity());
        countries.get("Russia").add(kuznetsk.getCity());
        countries.put("UK", new ArrayList<>());
        countries.get("UK").add(london.getCity());
        countries.get("UK").add(liverpool.getCity());
        countries.get("UK").add(manchester.getCity());
        countries.put("Czech Republic", new ArrayList<>());
        countries.get("Czech Republic").add(prague.getCity());
        countries.get("Czech Republic").add(brno.getCity());
        countries.get("Czech Republic").add(olomouc.getCity());
        System.out.println(countries);
    }
}
