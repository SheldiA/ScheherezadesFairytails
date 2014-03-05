package by.bsuir.scheherezadesfairytales.controller;
import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class ShowAllFairytalesTO extends TO{
    private final ArrayList<Fairytale> fairytales;
    /**
     * 
     * @return all fairytales in collection
     */
    public ArrayList<Fairytale> getFairytales(){
        return fairytales;
    }
    
    /**
     * 
     * @param numCommand command number
     * @param fairytales is list of all fairytales in collection
     */
    public ShowAllFairytalesTO(int numCommand,ArrayList<Fairytale> fairytales){
        super(numCommand);
        this.fairytales = fairytales;
    }
}
