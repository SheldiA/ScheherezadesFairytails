
package by.bsuir.lw01.controller;

import by.bsuir.lw01.bl.AddCommand;
import by.bsuir.lw01.bl.Command;
import by.bsuir.lw01.bl.FindBySizeCommand;
import by.bsuir.lw01.bl.FindTheMostPopularCommand;
import by.bsuir.lw01.bl.ShowAllFairytalesCommand;
import by.bsuir.lw01.constant.Const;
import by.bsuir.lw01.view.View;
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
