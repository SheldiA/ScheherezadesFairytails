
package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import by.bsuir.scheherezadesfairytailes.entity.FairytailesCollection;
/**
 *
 * @author Anna
 */
public class FindTheMostPopularCommand extends Command{
    @Override
    public TO execute(TO to){
        Fairytail resultFairytail = null;
        int numFairytails = FairytailesCollection.getFairytails().size();
        if(numFairytails > 0){
            resultFairytail = FairytailesCollection.getFairytails().get(0);
            int maxPopularity = resultFairytail.getPopularity();
            for(int i = 1; i < numFairytails; ++i){
                int currPopularity = FairytailesCollection.getFairytails().get(i).getPopularity();
                if(currPopularity > maxPopularity){
                    maxPopularity = currPopularity;
                    resultFairytail = FairytailesCollection.getFairytails().get(i);
                }
            }
        }
        return new FindTheMostPopularTO(to.getNumCommand(),resultFairytail);
    } 
}
