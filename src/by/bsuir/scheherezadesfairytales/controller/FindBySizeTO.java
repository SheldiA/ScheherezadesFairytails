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
    public int getSize(){
        return size;
    }
    public ArrayList<Fairytale> getFairytales(){
        return fairytales;
    }
    
    public FindBySizeTO(int numCommand,int size,ArrayList<Fairytale> fairytales){
        super(numCommand);
        this.size = size;
        this.fairytales = fairytales;
    }
}
