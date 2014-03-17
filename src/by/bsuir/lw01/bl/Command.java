package by.bsuir.lw01.bl;
import by.bsuir.lw01.controller.TO;
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
