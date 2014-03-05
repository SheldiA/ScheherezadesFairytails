package by.bsuir.scheherezadesfairytales.view;
import by.bsuir.scheherezadesfairytales.controller.AddTO;
import by.bsuir.scheherezadesfairytales.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytales.controller.TO;
import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import by.bsuir.scheherezadesfairytales.controller.FindBySizeTO;
import by.bsuir.scheherezadesfairytales.controller.ShowAllFairytalesTO;
import by.bsuir.scheherezadesfairytales.Const;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author Anna
 */
public class View {
    private ArrayList<TO> requests;
    private int currRequest = 0;    
    
    public View(){
        requests = new ArrayList<TO>();
        generateRequests();        
    }
    
    /**
     * hard-coding generator of user requests
     */
    private void generateRequests(){  
        Random random = new Random();
        for(int i = 0; i < Const.NUMBER_OF_FAIRYTALES_FOR_ADDITION; ++i)
            requests.add(new AddTO(Const.ADD_COMMAND_NUMBER, new Fairytale("fairytale" + String.valueOf(i + 1),random.nextInt(1000) + 100,random.nextInt(100)), false));
        requests.add(new ShowAllFairytalesTO(Const.SHOW_ALL_COMMAND_NUMBER, null));
        requests.add(new FindTheMostPopularTO(Const.FIND_THE_MOST_POPULAR_COMMAND_NUMBER, null));
        requests.add(new FindBySizeTO(Const.FIND_BY_SIZE_COMMAND_NUMBER,500,null));
    }
    
    /**
     * 
     * @return a param to transfer to controller
     */
    public TO getNextRequest(){ 
        if(currRequest < requests.size()){
            ++currRequest;
            return requests.get(currRequest - 1);
        }
        else
            return null;
    }
    
    /**
     * 
     * @param to a outcoming from controller param which needed to show bu user
     */
    public void showInfo(TO to){
        
        if(to instanceof AddTO)
            if(((AddTO)to).isResult()){
                Fairytale newFairytale = ((AddTO)to).getFairytale();
                if(newFairytale != null){
                    System.out.print("Successfully add fairytale " + newFairytale.getTitle());
                    System.out.println(" with popularity " + newFairytale.getPopularity() + " and size " + newFairytale.getSize());
                }
            }
        
        if(to instanceof ShowAllFairytalesTO){
            ArrayList<Fairytale> allFairytales = ((ShowAllFairytalesTO)to).getFairytales();
            if(allFairytales.size() > 0){
                for(int i = 0; i < allFairytales.size(); ++i){
                    Fairytale currFairytale = allFairytales.get(i);
                    System.out.print((i + 1) + ". " + currFairytale.getTitle());
                    System.out.print(" size " + currFairytale.getSize());
                    System.out.println(" popularity " + currFairytale.getPopularity());
                }
            }
        }
        
        if(to instanceof FindTheMostPopularTO){
            Fairytale result = ((FindTheMostPopularTO)to).getResultFairytale();
            if(result != null)
                System.out.println("The most popular fairytale is " + result.getTitle() + " with popularity " + result.getPopularity());
        }
        
        if(to instanceof FindBySizeTO){
            ArrayList<Fairytale> result = ((FindBySizeTO)to).getFairytales();
            if(result.size() > 0){
                System.out.println("for size " + ((FindBySizeTO)to).getSize() + " was found: ");
                for(int i = 0; i < result.size(); ++i)
                    System.out.println(result.get(i).getTitle()+ " with size " + result.get(i).getSize());
            }
        }
        
    }
}
