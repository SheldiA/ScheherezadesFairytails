package by.bsuir.scheherezadesfairytailes.controller;

import by.bsuir.scheherezadesfairytailes.entity.Fairytail;

/**
 *
 * @author Anna
 */
public class FindByPopularityTO extends TO{
    private int popularity;
    private Fairytail resultFairytail;
    public int getPopularity(){
        return popularity;
    }
    
    public Fairytail getResultFairytail(){
        return resultFairytail;
    }
    
    public FindByPopularityTO(int numCommand,int popularity){
        super(numCommand);
        this.popularity = popularity;
        resultFairytail = null;
    }
}
