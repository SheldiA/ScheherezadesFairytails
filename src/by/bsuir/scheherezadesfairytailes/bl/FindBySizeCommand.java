package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.controller.FindBySizeTO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import java.util.ArrayList;
/**
 *
 * @author Anna
 */
public class FindBySizeCommand extends Command {
    public TO execute(TO to){
        ArrayList<Fairytail> resultFairytails = new ArrayList<Fairytail>();
        return new FindBySizeTO(to.getNumCommand(),((FindBySizeTO)to).getSize(), resultFairytails);
    }
}
