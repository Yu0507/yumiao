package com.colin.demo;

import com.colin.modle.Goods;
import com.colin.modle.Person;

public class Demo1
{
    public static void main(String[] args)
    {
        Person per1 = new Person("于淼", 30, "230108199001010101", "18846457728");
        Person per2 = new Person("于淼", 28, "230108199001010101", "110");
        Person per3 = new Person("老王", 28, "230108199001010101", "110");
        Person per4 = new Person("老张", 70, "230108199001010101", "7728");
        System.out.println("1." + per1.equals(per2));
        System.out.println("2." + per2.equals(per3));
        Goods goods1 = new Goods("面包",5.27D);
        System.out.println("3." + goods1);
        System.out.println("4." + per3.equals(per4));
    }
}
