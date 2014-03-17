package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.ShowAllFairytalesTO;
import by.bsuir.lw01.controller.TO;
import by.bsuir.lw01.entity.FairytalesCollection;

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
        return new ShowAllFairytalesTO(to.getNumCommand(),FairytalesCollection.getInstance().getFairytales());
    }
}
