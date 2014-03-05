package by.bsuir.scheherezadesfairytales.bl;
import by.bsuir.scheherezadesfairytales.controller.TO;
/**
 *
 * @author Anna
 */
public abstract class Command {
    /**
     * 
     * @param to incoming params
     * @return outcoming param
     */
    public abstract TO execute(TO to); 
}
