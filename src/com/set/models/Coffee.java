package com.set.models;

import java.util.Comparator;
import java.util.Objects;
/**
 * This generic class implements Comparable interface
 * The class has two private fields: name and price
 * The class has constructor, getter and setter methods
 * toString(), equals(), hashCode() and compareTo() methods are overridden
 * @param  </Coffee> the type of elements of this class
 * @see java.util.SortedSet interface
 */
public class Coffee implements Comparable <Coffee>{
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return price == coffee.price &&
                name.equals(coffee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + ' ' + price+ ", ";
    }


    /**
     * This method compares elements at first according to the name
     * then by the price and returns the result
     * @param o the element of this class type which receives the method
     * and compare with other elements of the same type
     * @return compared and sorted elements by all fields
     */
    @Override
    public int compareTo(Coffee o) {
        return Comparator.comparing(Coffee:: getName )
                .thenComparing(Coffee::getPrice)
                .compare(this, o);
    }
}
