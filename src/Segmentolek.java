
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Segmentolek {

    public static int getAge(){
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość segmentów (pierwsza liczba) " +
                "oraz ilość nóżek wystarających z kolejnych segmentów");
        String zestawDanych = in.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < zestawDanych.length(); i++) {
            list.add(Integer.parseInt(zestawDanych.substring(i, i+1)));
        }
        Integer liczbaSegmentow = list.remove(0);
        Integer sumaNozek = list.stream()
                .reduce(0, Integer::sum);
        if (sumaNozek == 0){
            age = liczbaSegmentow;
        }


        return sumaNozek;
    }
}
