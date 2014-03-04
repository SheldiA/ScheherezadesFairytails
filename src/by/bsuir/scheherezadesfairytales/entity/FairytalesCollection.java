package by.bsuir.scheherezadesfairytales.entity;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class FairytalesCollection {
    private static ArrayList<Fairytale> fairytales = null;
    private static final int maxCapacity = 50;
    
    public static ArrayList<Fairytale> getFairytales(){
        if(fairytales == null)
            fairytales = new ArrayList<Fairytale>();
        return fairytales;
    }
    
    public static boolean addFairytale(Fairytale fairytale){
        boolean result = false;
        if(fairytales == null)
            fairytales = new ArrayList<Fairytale>();
        if(fairytales.size() < maxCapacity){
            fairytales.add(fairytale);
            result = true;
        }
        
        return result;
    }
    
    public static boolean addFairytales(ArrayList<Fairytale> addingFairytales){
        boolean result = false;
        for(Fairytale fairytale:addingFairytales)
            result = FairytalesCollection.addFairytale(fairytale);
        return result;
    }
}
