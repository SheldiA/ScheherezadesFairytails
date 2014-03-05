package by.bsuir.scheherezadesfairytales.bl;
import by.bsuir.scheherezadesfairytales.controller.ShowAllFairytalesTO;
import by.bsuir.scheherezadesfairytales.controller.TO;
import by.bsuir.scheherezadesfairytales.entity.FairytalesCollection;

/**
 *
 * @author Anna
 */
public class ShowAllFairytalesCommand extends Command{
    @Override
    /**
     * implement execute method for show all command
     */
    public TO execute(TO to){
        return new ShowAllFairytalesTO(to.getNumCommand(),FairytalesCollection.getFairytales());
    }
}
