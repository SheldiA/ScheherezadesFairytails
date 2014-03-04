
package by.bsuir.scheherezadesfairytales.bl;
import by.bsuir.scheherezadesfairytales.controller.TO;
import by.bsuir.scheherezadesfairytales.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import by.bsuir.scheherezadesfairytales.entity.FairytalesCollection;
/**
 *
 * @author Anna
 */
public class FindTheMostPopularCommand extends Command{
    @Override
    public TO execute(TO to){
        Fairytale resultFairytale = null;
        int numFairytails = FairytalesCollection.getFairytales().size();
        if(numFairytails > 0){
            resultFairytale = FairytalesCollection.getFairytales().get(0);
            int maxPopularity = resultFairytale.getPopularity();
            for(int i = 1; i < numFairytails; ++i){
                int currPopularity = FairytalesCollection.getFairytales().get(i).getPopularity();
                if(currPopularity > maxPopularity){
                    maxPopularity = currPopularity;
                    resultFairytale = FairytalesCollection.getFairytales().get(i);
                }
            }
        }
        return new FindTheMostPopularTO(to.getNumCommand(),resultFairytale);
    } 
}
