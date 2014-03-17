package by.bsuir.lw01.controller;

import by.bsuir.lw01.entity.Fairytale;

/**
 *
 * @author Anna
 */
public class FindTheMostPopularTO extends TO{
    private Fairytale resultFairytale;
    /**
     * 
     * @return the most popular fairytale
     */
    public Fairytale getResultFairytale(){
        return resultFairytale;
    }
    
    /**
     * 
     * @param numCommand command number
     * @param fairytale the most popular fairytale
     */
    public FindTheMostPopularTO(int numCommand,Fairytale fairytale){
        super(numCommand);
        resultFairytale = fairytale;
    }
}
