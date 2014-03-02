package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.controller.AddTO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
/**
 *
 * @author Anna
 */
public class AddCommand extends Command{
    public TO execute(TO to){
        Fairytail resultFairytail = null;
        
        return new AddTO(to.getNumCommand(), resultFairytail);
    }
}
