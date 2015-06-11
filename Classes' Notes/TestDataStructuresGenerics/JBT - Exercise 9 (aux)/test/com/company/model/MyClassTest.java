package com.company.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leonardoriviere on 6/10/15.
 */
public class MyClassTest {

    private MyClass myClass = new MyClass();

    @Test
    public void test_exceptions() {

        myClass.myMethod();

    }

    @Test
    public void test() {
        int a = 2;
        int b = 2;

        int c = myClass.sum(a, b);

        Assert.assertEquals(4, c);
    }

    @Test
    public void dataStructures() {
        String name1 = new String("Pepe");
        String name2 = new String("Pepe 2");
        String name3 = new String("Pepe 3");
        String name4 = new String("Pepe");
        String name5 = new String("Pepe 5");

        String[] names = new String[5];
        names[0] = name1;
        names[1] = name2;
        names[2] = name3;
        names[3] = name4;
        names[4] = name5;

        System.out.println(String.format("Cantidad de nombres: %d. ", names.length));
        Assert.assertEquals(5, names.length);

        // Object[] objects = new Object[4];
        // boolean[]
        // Dog[]
        // Exception[] exceptions = new Exception[3];

        int[][] integers = new int[2][2];
        integers[0][0] = 1;
        integers[0][1] = 2;
        integers[1][0] = 1;
        integers[1][1] = 2;

        /*
         * java.util.List
         *          |_ ArrayList
         *          |_ LinkedList
         *          |_ SortedList
         *          |_ etc...
         */

        List<String> nameList = new ArrayList<>();
        for (String name : names) {
            nameList.add(name);
        }
        System.out.println("Lista -> " + nameList);
        Assert.assertNotNull(nameList);
        Assert.assertFalse(nameList.isEmpty());
        Assert.assertEquals(5, nameList.size());

        nameList.clear();
        Assert.assertTrue(nameList.isEmpty());
        System.out.println("Lista -> " + nameList);

        /*
         * java.util.Set
         *          |_ HashSet
         *          |_ TreeSet
         *          |_ etc...
         */

        Set<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }
        System.out.println("Set -> " + uniqueNames);

        /*
         * java.util.Map
         *          |_ HashMap
         *          |_ TreeMap
         *          |_ etc...
         */

        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        for (String name : names) {
            map.put(i, name);
            i++;
        }
        System.out.println("Map -> " + map);
        map.put(4, "Cris Morena");
        System.out.println("Map -> " + map);

    }

    @Test
    public void testGenerics() {
        Box box = new Box();
    }
}
