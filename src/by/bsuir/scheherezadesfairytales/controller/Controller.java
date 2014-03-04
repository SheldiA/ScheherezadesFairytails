
package by.bsuir.scheherezadesfairytales.controller;

import by.bsuir.scheherezadesfairytales.bl.AddCommand;
import by.bsuir.scheherezadesfairytales.bl.Command;
import by.bsuir.scheherezadesfairytales.bl.FindBySizeCommand;
import by.bsuir.scheherezadesfairytales.bl.FindTheMostPopularCommand;
import by.bsuir.scheherezadesfairytales.bl.ShowAllFairytalesCommand;
import by.bsuir.scheherezadesfairytales.view.View;
import java.util.HashMap;

/**
 *
 * @author Anna
 */
public class Controller {
    private final HashMap<Integer,Command> allCommands;
    private final View view;
    public Controller(View v){
        allCommands = new HashMap<Integer,Command>();
        allCommands.put(1,new AddCommand());
        allCommands.put(2, new FindTheMostPopularCommand());
        allCommands.put(3,new FindBySizeCommand());
        allCommands.put(4, new ShowAllFairytalesCommand());
        view = v;
    }
    
    public void run(){
        TO to = view.getNextRequest();
        while(to != null){
            TO resultTO = allCommands.get(to.numCommand).execute(to);
            view.showInfo(resultTO);
            to = view.getNextRequest();
        }
    }
}
