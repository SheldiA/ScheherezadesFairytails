package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.ShowAllFairytailesTO;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.entity.FairytailesCollection;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import java.util.ArrayList;

/**
 *
 * @author Anna
 */
public class ShowAllFairytailesCommand extends Command{
    @Override
    public TO execute(TO to){
        return new ShowAllFairytailesTO(to.getNumCommand(),FairytailesCollection.getFairytails());
    }
}
