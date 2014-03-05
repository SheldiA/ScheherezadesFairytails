package by.bsuir.scheherezadesfairytales.controller;

import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class FindBySizeTO extends TO{
    private int size;
    private ArrayList<Fairytale> fairytales;
    
    /**
     * 
     * @return maximum length of sum of fairytales size
     */
    public int getSize(){
        return size;
    }
    
    /**
     * 
     * @return a list of fairytales, which sum of size less than param size
     */
    public ArrayList<Fairytale> getFairytales(){
        return fairytales;
    }
    
    /**
     * 
     * @param numCommand command number
     * @param size maximum number of sum of fairytales size
     * @param fairytales list of results fairytales
     */
    public FindBySizeTO(int numCommand,int size,ArrayList<Fairytale> fairytales){
        super(numCommand);
        this.size = size;
        this.fairytales = fairytales;
    }
}
