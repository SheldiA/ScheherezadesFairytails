package by.bsuir.scheherezadesfairytailes.entity;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class FairytailesCollection {
    private static ArrayList<Fairytail> fairytails = null;
    private static final int maxCapacity = 50;
    
    public static ArrayList<Fairytail> getFairytails(){
        if(fairytails == null)
            fairytails = new ArrayList<Fairytail>();
        return fairytails;
    }
    
    public static boolean addFairytail(Fairytail fairytail){
        boolean result = false;
        if(fairytails == null)
            fairytails = new ArrayList<Fairytail>();
        if(fairytails.size() < maxCapacity){
            fairytails.add(fairytail);
            result = true;
        }
        
        return result;
    }
    
    public static boolean addFairytails(ArrayList<Fairytail> addingFairytails){
        boolean result = false;
        for(Fairytail fairytail:addingFairytails)
            result = FairytailesCollection.addFairytail(fairytail);
        return result;
    }
}
