/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

/**
 *
 * @author Nimsara
 */
import com.example.model.BaseModel;
import java.util.List;

public class GenericDAO<T extends BaseModel> {

    private final List<T> items;

    public GenericDAO(List<T> items) {
        this.items = items;
    }

    public List<T> getAll() {
        return items;
    }

    public T getById(int id) {
        for (T item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void add(T item) {
        int maxId = 0;
        for (T i : items) {
            if (i.getId() > maxId) {
                maxId = i.getId();
            }
            item.setId(maxId + 1);
            items.add(item);
        }
    }

    public void update(T updatedItem) {
        for (int i = 0; i < items.size(); i++) {
            T item = items.get(i);
            if (item.getId() == updatedItem.getId()){
                items.set(i, updatedItem);
                return;
            }
        }

    }
    
    public void delete(int id){
    items.removeIf(item -> item.getId()==id);
    }

}
