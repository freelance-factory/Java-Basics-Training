package com.company.model;

import java.util.Collection;

public interface IsBox<K extends Number, V extends Collection<? extends Number>> {
    K getKey();

    void setKey(K key);

    V getValue();

    void setValue(V value);
}
