package by.bsuir.scheherezadesfairytailes.controller;

import by.bsuir.scheherezadesfairytailes.entity.Fairytail;

/**
 *
 * @author Anna
 */
public class FindTheMostPopularTO extends TO{
    private int popularity;
    private Fairytail resultFairytail;
    public int getPopularity(){
        return popularity;
    }
    
    public Fairytail getResultFairytail(){
        return resultFairytail;
    }
    
    public FindTheMostPopularTO(int numCommand,int popularity,Fairytail fairyTail){
        super(numCommand);
        this.popularity = popularity;
        resultFairytail = fairyTail;
    }
}
