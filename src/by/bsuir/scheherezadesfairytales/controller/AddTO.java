package by.bsuir.scheherezadesfairytales.controller;

import by.bsuir.scheherezadesfairytales.entity.Fairytale;

/**
 *
 * @author Anna
 */
public class AddTO extends TO {
    private final Fairytale fairytale;
    private final boolean result;
    /**
     * 
     * @return added fairytale
     */
    public Fairytale getFairytale(){
        return fairytale;
    }
    
    /**
     * 
     * @return false if addition was success
     */
    public boolean isResult(){
        return result;
    }
    
    /**
     * 
     * @param numCommand command number
     * @param fairytale added fairytale
     * @param result result of addition
     */
    public AddTO(int numCommand,Fairytale fairytale,boolean result){
        super(numCommand);
        this.fairytale = fairytale;
        this.result = result;
    }
}
