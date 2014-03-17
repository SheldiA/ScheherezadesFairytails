package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.TO;
import by.bsuir.lw01.controller.FindBySizeTO;
import by.bsuir.lw01.entity.Fairytale;
import by.bsuir.lw01.entity.FairytalesCollection;
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
        
        int numFairytails = FairytalesCollection.getInstance().getFairytales().size();
        if(to instanceof FindBySizeTO && numFairytails > 0){
            int maxSize = ((FindBySizeTO)to).getSize();
            for(int i = 0; i < numFairytails; ++i){
                Fairytale currFairytail = FairytalesCollection.getInstance().getFairytales().get(i);
                if(currFairytail.getSize() <= maxSize){
                    resultFairytales.add(currFairytail);
                    maxSize -= currFairytail.getSize();
                }
            }
        }
        
        return new FindBySizeTO(to.getNumCommand(),((FindBySizeTO)to).getSize(), resultFairytales);
    }
}
