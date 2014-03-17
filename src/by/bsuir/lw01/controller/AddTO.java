package by.bsuir.lw01.controller;

import by.bsuir.lw01.entity.Fairytale;

/**
 *
 * @author Anna
 */
public class AddTO extends TO {
    private Fairytale fairytale;
    private boolean result;
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
