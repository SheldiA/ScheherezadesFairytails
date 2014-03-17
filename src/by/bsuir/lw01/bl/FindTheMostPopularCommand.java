
package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.TO;
import by.bsuir.lw01.controller.FindTheMostPopularTO;
import by.bsuir.lw01.entity.Fairytale;
import by.bsuir.lw01.entity.FairytalesCollection;
import java.util.Iterator;
/**
 *
 * @author Anna
 */
public class FindTheMostPopularCommand extends Command{
    @Override
    /**
     * implement execute method for find the most poplar command
     */
    public TO execute(TO to){
        Fairytale resultFairytale = null;
        Iterator<Fairytale> allFairytales = FairytalesCollection.getInstance().getFairytales();
        
        if(allFairytales.hasNext()){
            
            resultFairytale = allFairytales.next();
            int maxPopularity = resultFairytale.getPopularity();
            
            while(allFairytales.hasNext()){
                Fairytale currFairytale = allFairytales.next();
                if(currFairytale.getPopularity() > maxPopularity){
                    maxPopularity = currFairytale.getPopularity();
                    resultFairytale = currFairytale;
                }
            }
        }
        
        return new FindTheMostPopularTO(to.getNumCommand(),resultFairytale);
    } 
}
