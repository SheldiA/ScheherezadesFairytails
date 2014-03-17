package by.bsuir.lw01.controller;

import by.bsuir.lw01.entity.Fairytale;
import java.util.Iterator;

/**
 *
 * @author Anna
 */
public class FindBySizeTO extends TO{
    private int size;
    private Iterator<Fairytale> fairytales;
    
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
    public Iterator<Fairytale> getFairytales(){
        return fairytales;
    }
    
    /**
     * 
     * @param numCommand command number
     * @param size maximum number of sum of fairytales size
     * @param fairytales list of results fairytales
     */
    public FindBySizeTO(int numCommand,int size,Iterator<Fairytale> fairytales){
        super(numCommand);
        this.size = size;
        this.fairytales = fairytales;
    }
}
