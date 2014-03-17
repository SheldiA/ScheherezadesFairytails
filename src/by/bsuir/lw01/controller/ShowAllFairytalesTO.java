package by.bsuir.lw01.controller;
import by.bsuir.lw01.entity.Fairytale;
import java.util.Iterator;
/**
 *
 * @author Anna
 */
public class ShowAllFairytalesTO extends TO{
    private Iterator<Fairytale> fairytales;
    /**
     * 
     * @return all fairytales in collection
     */
    public Iterator<Fairytale> getFairytales(){
        return fairytales;
    }
    
    /**
     * 
     * @param numCommand command number
     * @param fairytales is list of all fairytales in collection
     */
    public ShowAllFairytalesTO(int numCommand,Iterator<Fairytale> fairytales){
        super(numCommand);
        this.fairytales = fairytales;
    }
}
