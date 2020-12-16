package com.colin.modle;

import java.util.Objects;

public class Person
{
    public String name;
    public int age;
    public String idNum;
    public String phoneNum;

    public Person(String name, int age, String idNum, String phoneNum)
    {
        this.name = name;
        this.age = age;
        this.idNum = idNum;
        this.phoneNum = phoneNum;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        else if (o instanceof Person)
        {
            Person another = (Person) o;
            if(this.idNum.equals(another.idNum) &&this.name == another.name )
            {
                return true;
            }
        }
        return false;
    }
    class Goods
    {
        public String name;
        public double price;

        public Goods(String name,double price)
        {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString()
        {
            return "Goods{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

}
