
package by.bsuir.scheherezadesfairytailes.controller;

import by.bsuir.scheherezadesfairytailes.bl.AddCommand;
import by.bsuir.scheherezadesfairytailes.bl.Command;
import by.bsuir.scheherezadesfairytailes.bl.FindBySizeCommand;
import by.bsuir.scheherezadesfairytailes.bl.FindTheMostPopularCommand;
import by.bsuir.scheherezadesfairytailes.bl.ShowAllFairytailesCommand;
import by.bsuir.scheherezadesfairytailes.view.View;
import java.util.HashMap;

/**
 *
 * @author Anna
 */
public class Controller {
    private final HashMap<Integer,Command> allCommands;
    private View view;
    public Controller(View v){
        allCommands = new HashMap<Integer,Command>();
        allCommands.put(1,new AddCommand());
        allCommands.put(2, new FindTheMostPopularCommand());
        allCommands.put(3,new FindBySizeCommand());
        allCommands.put(4, new ShowAllFairytailesCommand());
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
