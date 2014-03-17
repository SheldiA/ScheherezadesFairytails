package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.TO;
import by.bsuir.lw01.controller.AddTO;
import by.bsuir.lw01.entity.FairytalesCollection;
/**
 *
 * @author Anna
 */
public class AddCommand extends Command{
    @Override
    /**
     * implement abstract method for add command
     */
    public TO execute(TO to){
        boolean result = false;
        
        if(to instanceof AddTO)
            result = FairytalesCollection.getInstance().addFairytale(((AddTO)to).getFairytale());
        
        return new AddTO(to.getNumCommand(),((AddTO)to).getFairytale(), result);
    }
}
