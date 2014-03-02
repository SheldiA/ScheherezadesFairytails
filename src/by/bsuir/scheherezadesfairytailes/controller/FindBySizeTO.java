package by.bsuir.scheherezadesfairytailes.controller;

import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class FindBySizeTO extends TO{
    private int size;
    private ArrayList<Fairytail> fairytails;
    public int getSize(){
        return size;
    }
    public ArrayList<Fairytail> getFairytails(){
        return fairytails;
    }
    
    public FindBySizeTO(int numCommand,int size){
        super(numCommand);
        this.size = size;
        fairytails = new ArrayList<Fairytail>();
    }
}
