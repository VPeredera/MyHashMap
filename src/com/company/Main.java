package com.company;

public class Main {

    public static void main(String[] args) {
	    MyMap map = new MyHashMap();
        map.put("1", "a1");
        map.put("2", "b2");
        map.put("3", "c3");
        System.out.println(map);
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsKey("99"));
        System.out.println(map.get("1"));
        System.out.println(map.get("99"));
        System.out.println(map.remove("3"));
        System.out.println(map);
    }
}
