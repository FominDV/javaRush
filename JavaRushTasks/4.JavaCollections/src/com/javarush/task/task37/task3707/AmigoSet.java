package com.javarush.task.task37.task3707;

import java.io.Serializable;
import java.util.*;

public class AmigoSet<E> extends AbstractSet<E> implements Cloneable, Serializable, Set<E> {

    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    @Override
    public boolean contains(Object o) {
        return map.keySet().contains(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean remove(Object o) {
        if(this.contains(o)){
            map.remove(o);
            return true;
        }
        return false;
    }

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        map = new HashMap<>(Math.max((int) (collection.size() / .75f) + 1, 16));
        collection.forEach(this::add);
    }

    @Override
    public Iterator iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

}
