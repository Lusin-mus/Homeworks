package com.set;

/**
 * The set interface  is a collection that contains no duplicate elements.  More formally, sets
 *  contain no pair of elements {@code e1} and {@code e2} such that
 *  {@code e1.equals(e2)}
 * @param <T> the type of elements maintained by this set
 */
public interface Set<T> {

    int getSize();
    void add(T data);
    void remove(T data);
    void contains(T data);
}
