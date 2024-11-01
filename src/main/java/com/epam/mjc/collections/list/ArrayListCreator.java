package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> list = new ArrayList<>();

        int count = 1;
        for (String s : sourceList) {
            if (count % 3 == 0) {
                list.add(s);
                list.add(s);
            }
            count++;
        }

        return list;
    }
}
