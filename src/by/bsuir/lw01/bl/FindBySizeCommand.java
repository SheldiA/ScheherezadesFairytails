package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.TO;
import by.bsuir.lw01.controller.FindBySizeTO;
import by.bsuir.lw01.entity.Fairytale;
import by.bsuir.lw01.entity.FairytalesCollection;
import java.util.ArrayList;
import java.util.Iterator;
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
        
        if(to instanceof FindBySizeTO){
            
            int maxSize = ((FindBySizeTO)to).getSize();
            Iterator<Fairytale> fairytalesCollection = FairytalesCollection.getInstance().getFairytales();
            
            while(fairytalesCollection.hasNext()){
                Fairytale currFairytale = fairytalesCollection.next();
                if(currFairytale.getSize() <= maxSize){
                    resultFairytales.add(currFairytale);
                    maxSize -= currFairytale.getSize();
                }
                
            }
        }
        
        return new FindBySizeTO(to.getNumCommand(),((FindBySizeTO)to).getSize(), resultFairytales.iterator());
    }
}
