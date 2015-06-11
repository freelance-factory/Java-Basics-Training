package com.company.model;

import java.util.Set;

public class Box implements IsBox<Integer,Set<Integer>> {

    public <L extends String> void show(L content) {

    }

    @Override
    public Integer getKey() {
        return null;
    }

    @Override
    public void setKey(Integer key) {

    }

    @Override
    public Set<Integer> getValue() {
        return null;
    }

    @Override
    public void setValue(Set<Integer> value) {

    }
}
