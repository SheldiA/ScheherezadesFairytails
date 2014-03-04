package by.bsuir.scheherezadesfairytales.controller;

import by.bsuir.scheherezadesfairytales.entity.Fairytale;

/**
 *
 * @author Anna
 */
public class FindTheMostPopularTO extends TO{
    private final Fairytale resultFairytale;
    
    public Fairytale getResultFairytale(){
        return resultFairytale;
    }
    
    public FindTheMostPopularTO(int numCommand,Fairytale fairytale){
        super(numCommand);
        resultFairytale = fairytale;
    }
}
