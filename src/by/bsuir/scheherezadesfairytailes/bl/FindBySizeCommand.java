package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.controller.FindBySizeTO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import by.bsuir.scheherezadesfairytailes.entity.FairytailesCollection;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class FindBySizeCommand extends Command {
    @Override
    public TO execute(TO to){
        ArrayList<Fairytail> resultFairytailes = new ArrayList<Fairytail>();
        
        int numFairytails = FairytailesCollection.getFairytails().size();
        if(to instanceof FindBySizeTO && numFairytails > 0){
            int maxSize = ((FindBySizeTO)to).getSize();
            for(int i = 0; i < numFairytails; ++i){
                Fairytail currFairytail = FairytailesCollection.getFairytails().get(i);
                if(currFairytail.getSize() <= maxSize){
                    resultFairytailes.add(currFairytail);
                    maxSize -= currFairytail.getSize();
                }
            }
        }
        
        return new FindBySizeTO(to.getNumCommand(),((FindBySizeTO)to).getSize(), resultFairytailes);
    }
}
