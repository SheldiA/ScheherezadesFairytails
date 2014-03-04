package by.bsuir.scheherezadesfairytales.controller;

import by.bsuir.scheherezadesfairytales.entity.Fairytale;

/**
 *
 * @author Anna
 */
public class AddTO extends TO {
    private final Fairytale fairytale;
    private final boolean result;
    public Fairytale getFairytale(){
        return fairytale;
    }
    
    public boolean isResult(){
        return result;
    }
    
    public AddTO(int numCommand,Fairytale fairytale,boolean result){
        super(numCommand);
        this.fairytale = fairytale;
        this.result = result;
    }
}
