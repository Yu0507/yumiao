package com.colin.modle;

public class Goods
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
