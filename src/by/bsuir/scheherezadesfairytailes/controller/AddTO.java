package by.bsuir.scheherezadesfairytailes.controller;

import by.bsuir.scheherezadesfairytailes.entity.Fairytail;

/**
 *
 * @author Anna
 */
public class AddTO extends TO {
    private Fairytail fairytail;
    private boolean result;
    public Fairytail getFairytail(){
        return fairytail;
    }
    
    public boolean isResult(){
        return result;
    }
    
    public AddTO(int numCommand,Fairytail fairytail,boolean result){
        super(numCommand);
        this.fairytail = fairytail;
        this.result = result;
    }
}
