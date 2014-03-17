
package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.TO;
import by.bsuir.lw01.controller.FindTheMostPopularTO;
import by.bsuir.lw01.entity.Fairytale;
import by.bsuir.lw01.entity.FairytalesCollection;
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
        int numFairytails = FairytalesCollection.getInstance().getFairytales().size();
        if(numFairytails > 0){
            resultFairytale = FairytalesCollection.getInstance().getFairytales().get(0);
            int maxPopularity = resultFairytale.getPopularity();
            for(int i = 1; i < numFairytails; ++i){
                int currPopularity = FairytalesCollection.getInstance().getFairytales().get(i).getPopularity();
                if(currPopularity > maxPopularity){
                    maxPopularity = currPopularity;
                    resultFairytale = FairytalesCollection.getInstance().getFairytales().get(i);
                }
            }
        }
        return new FindTheMostPopularTO(to.getNumCommand(),resultFairytale);
    } 
}
