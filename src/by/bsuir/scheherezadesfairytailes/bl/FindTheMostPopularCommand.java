
package by.bsuir.scheherezadesfairytailes.bl;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
/**
 *
 * @author Anna
 */
public class FindTheMostPopularCommand extends Command{
    public TO execute(TO to){
        Fairytail resultFairytail = null;
        return new FindTheMostPopularTO(to.getNumCommand(),((FindTheMostPopularTO)to).getPopularity(),resultFairytail);
    } 
}
