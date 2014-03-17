/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package by.bsuir.lw01.entity;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Анна
 */
public class FairytalesCollection {
    
    private ArrayList<Fairytale> fairytailes;
    private static final int maxCapacity = 50;
    
    private FairytalesCollection() {
        fairytailes = new ArrayList<Fairytale>();
    }
    
    /**
     * 
     * @param fairytale adding fairytale
     * @return true if successfully added
     */
    public boolean addFairytale(Fairytale fairytale){
        if(fairytailes.size() < maxCapacity)
            return fairytailes.add(fairytale);
        return false;
    }
    
    /**
     * 
     * @return fairytales collection
     */
    public ArrayList<Fairytale> getFairytales(){
        return fairytailes;
    }
    
    /**
     * 
     * @return singletom object
     */
    public static FairytalesCollection getInstance() {
        return FairytalesCollectionHolder.INSTANCE;
    }
    
    private static class FairytalesCollectionHolder {

        private static final FairytalesCollection INSTANCE = new FairytalesCollection();
    }
}
