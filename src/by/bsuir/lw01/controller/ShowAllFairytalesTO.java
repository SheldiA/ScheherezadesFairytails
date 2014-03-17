package by.bsuir.lw01.controller;
import by.bsuir.lw01.entity.Fairytale;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class ShowAllFairytalesTO extends TO{
    private ArrayList<Fairytale> fairytales;
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
