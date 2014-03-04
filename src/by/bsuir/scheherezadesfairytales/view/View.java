package by.bsuir.scheherezadesfairytales.view;
import by.bsuir.scheherezadesfairytales.controller.AddTO;
import by.bsuir.scheherezadesfairytales.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytales.controller.TO;
import by.bsuir.scheherezadesfairytales.entity.Fairytale;
import by.bsuir.scheherezadesfairytales.controller.FindBySizeTO;
import by.bsuir.scheherezadesfairytales.controller.ShowAllFairytalesTO;
import java.util.ArrayList;
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
    private void generateRequests(){        
        requests.add(new AddTO(1, new Fairytale("first",400,5), false));
        requests.add(new AddTO(1, new Fairytale("second",200,7), false));
        requests.add(new AddTO(1, new Fairytale("third",50,3), false));
        requests.add(new ShowAllFairytalesTO(4, null));
        requests.add(new FindTheMostPopularTO(2, null));
        requests.add(new FindBySizeTO(3,300,null));
    }
    
    public TO getNextRequest(){ 
        if(currRequest < requests.size()){
            ++currRequest;
            return requests.get(currRequest - 1);
        }
        else
            return null;
    }
    
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
