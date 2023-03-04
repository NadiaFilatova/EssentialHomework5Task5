package homework;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    ArrayList<String> stringArrayList = new ArrayList<>();

    public void addFriends() {
        stringArrayList.add("Anatoly");
        stringArrayList.add("Andriy");
        stringArrayList.add("Ganna");
        stringArrayList.add("Antonina");
        stringArrayList.add("Ganna");
        stringArrayList.add("Volodymir");
        stringArrayList.add("Daryna");
        stringArrayList.add("Foma");
        stringArrayList.add("Anna");
        stringArrayList.add("Marta");
        stringArrayList.add("Elvin");
    }

    public void print() {

        System.out.println(stringArrayList + " - this is not a sorted list");
        Collections.sort(stringArrayList);
        System.out.println(stringArrayList + "- this is a sorted list ");
    }

}
