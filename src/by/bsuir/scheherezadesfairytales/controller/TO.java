
package by.bsuir.scheherezadesfairytales.controller;

/**
 *
 * @author Anna
 */
public class TO {
    protected int numCommand;
    /**
     * 
     * @return command number
     */
    public int getNumCommand(){
        return numCommand;
    }
    
    /**
     * 
     * @param numCommand command number that accept a this TO
     */
    public TO(int numCommand){
        this.numCommand = numCommand;
    }
}
