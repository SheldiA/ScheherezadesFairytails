package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.controller.AddTO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import by.bsuir.scheherezadesfairytailes.entity.FairytailesCollection;
/**
 *
 * @author Anna
 */
public class AddCommand extends Command{
    @Override
    public TO execute(TO to){
        boolean result = false;
        if(to instanceof AddTO)
            result = FairytailesCollection.addFairytail(((AddTO)to).getFairytail());
        return new AddTO(to.getNumCommand(),null, result);
    }
}
