package org.launchcode.techjobsmvc;

import java.util.Comparator;
// imports two objects, converts them to lowercase strings, and compares them
public class NameSorter implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
    }

}
