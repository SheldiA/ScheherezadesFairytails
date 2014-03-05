package by.bsuir.scheherezadesfairytales.bl;
import by.bsuir.scheherezadesfairytales.controller.TO;
import by.bsuir.scheherezadesfairytales.controller.FindBySizeTO;
import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import by.bsuir.scheherezadesfairytales.entity.FairytalesCollection;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class FindBySizeCommand extends Command {
    @Override
    /**
     * implement execute method for find by size command
     */
    public TO execute(TO to){
        ArrayList<Fairytale> resultFairytales = new ArrayList<Fairytale>();
        
        int numFairytails = FairytalesCollection.getFairytales().size();
        if(to instanceof FindBySizeTO && numFairytails > 0){
            int maxSize = ((FindBySizeTO)to).getSize();
            for(int i = 0; i < numFairytails; ++i){
                Fairytale currFairytail = FairytalesCollection.getFairytales().get(i);
                if(currFairytail.getSize() <= maxSize){
                    resultFairytales.add(currFairytail);
                    maxSize -= currFairytail.getSize();
                }
            }
        }
        
        return new FindBySizeTO(to.getNumCommand(),((FindBySizeTO)to).getSize(), resultFairytales);
    }
}
