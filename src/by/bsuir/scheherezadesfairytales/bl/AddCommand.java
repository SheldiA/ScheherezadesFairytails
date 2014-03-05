package by.bsuir.scheherezadesfairytales.bl;
import by.bsuir.scheherezadesfairytales.controller.TO;
import by.bsuir.scheherezadesfairytales.controller.AddTO;
import by.bsuir.scheherezadesfairytales.entity.FairytalesCollection;
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
            result = FairytalesCollection.addFairytale(((AddTO)to).getFairytale());
        return new AddTO(to.getNumCommand(),((AddTO)to).getFairytale(), result);
    }
}
