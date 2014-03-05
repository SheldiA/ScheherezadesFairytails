
package by.bsuir.scheherezadesfairytales.controller;

import by.bsuir.scheherezadesfairytales.bl.AddCommand;
import by.bsuir.scheherezadesfairytales.bl.Command;
import by.bsuir.scheherezadesfairytales.bl.FindBySizeCommand;
import by.bsuir.scheherezadesfairytales.bl.FindTheMostPopularCommand;
import by.bsuir.scheherezadesfairytales.bl.ShowAllFairytalesCommand;
import by.bsuir.scheherezadesfairytales.Const;
import by.bsuir.scheherezadesfairytales.view.View;
import java.util.HashMap;

/**
 *
 * @author Anna
 */
public class Controller {
    private final HashMap<Integer,Command> allCommands;
    private final View view;
    
    /**
     * 
     * @param v view for this controller 
     */
    public Controller(View v){
        allCommands = new HashMap<Integer,Command>();
        allCommands.put(Const.ADD_COMMAND_NUMBER,new AddCommand());
        allCommands.put(Const.FIND_THE_MOST_POPULAR_COMMAND_NUMBER, new FindTheMostPopularCommand());
        allCommands.put(Const.FIND_BY_SIZE_COMMAND_NUMBER,new FindBySizeCommand());
        allCommands.put(Const.SHOW_ALL_COMMAND_NUMBER, new ShowAllFairytalesCommand());
        view = v;
    }
    
    /**
     * method for run of this controller
     */
    public void run(){
        TO to = view.getNextRequest();
        while(to != null){
            TO resultTO = allCommands.get(to.numCommand).execute(to);
            view.showInfo(resultTO);
            to = view.getNextRequest();
        }
    }
}
