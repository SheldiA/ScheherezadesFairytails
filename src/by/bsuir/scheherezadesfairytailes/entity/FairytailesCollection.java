package by.bsuir.scheherezadesfairytailes.entity;

import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class FairytailesCollection {
    private static ArrayList<Fairytail> fairytails = null;
    public static ArrayList<Fairytail> getFairytails(){
        if(fairytails == null)
            fairytails = new ArrayList<Fairytail>();
        return fairytails;
    }
            
}
