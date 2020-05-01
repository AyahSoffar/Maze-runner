/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 */
public class CareTaker {

    private List<Memento> mementoList = new ArrayList<Memento>();

    public List<Memento> getMementoList() {
        return mementoList;
    }

    public void setMementoList(List<Memento> mementoList) {
        this.mementoList = mementoList;
    }

    public void add(Memento state) {
        mementoList.add(state);

    }

    public Memento get(int index) {
        return mementoList.get(index);
    }

}
