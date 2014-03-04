package by.bsuir.scheherezadesfairytales.controller;
import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class ShowAllFairytalesTO extends TO{
    private final ArrayList<Fairytale> fairytales;
    
    public ArrayList<Fairytale> getFairytales(){
        return fairytales;
    }
    
    public ShowAllFairytalesTO(int numCommand,ArrayList<Fairytale> fairytales){
        super(numCommand);
        this.fairytales = fairytales;
    }
}
