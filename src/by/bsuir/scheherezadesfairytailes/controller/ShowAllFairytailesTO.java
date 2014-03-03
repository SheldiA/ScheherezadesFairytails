package by.bsuir.scheherezadesfairytailes.controller;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class ShowAllFairytailesTO extends TO{
    private ArrayList<Fairytail> fairytailes;
    
    public ArrayList<Fairytail> getFairytailes(){
        return fairytailes;
    }
    
    public ShowAllFairytailesTO(int numCommand,ArrayList<Fairytail> fairytailes){
        super(numCommand);
        this.fairytailes = fairytailes;
    }
}
