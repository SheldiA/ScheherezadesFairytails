package by.bsuir.scheherezadesfairytailes.controller;

import by.bsuir.scheherezadesfairytailes.entity.Fairytail;

/**
 *
 * @author Anna
 */
public class FindTheMostPopularTO extends TO{
    private Fairytail resultFairytail;
    
    public Fairytail getResultFairytail(){
        return resultFairytail;
    }
    
    public FindTheMostPopularTO(int numCommand,Fairytail fairyTail){
        super(numCommand);
        resultFairytail = fairyTail;
    }
}
