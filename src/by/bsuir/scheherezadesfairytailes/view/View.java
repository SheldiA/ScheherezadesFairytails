package by.bsuir.scheherezadesfairytailes.view;
import by.bsuir.scheherezadesfairytailes.controller.AddTO;
import by.bsuir.scheherezadesfairytailes.controller.Controller;
import by.bsuir.scheherezadesfairytailes.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
import by.bsuir.scheherezadesfairytailes.controller.FindBySizeTO;
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
        requests.add(new AddTO(1, new Fairytail("first",100,5), false));
        requests.add(new AddTO(1, new Fairytail("second",200,7), false));
        requests.add(new AddTO(1, new Fairytail("third",150,3), false));
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
                Fairytail newFairytail = ((AddTO)to).getFairytail();
                if(newFairytail != null){
                    System.out.print("Successfully add fairytail " + newFairytail.getTitle());
                    System.out.println(" with popularity " + newFairytail.getPopularity() + " and size " + newFairytail.getSize());
                }
            }
        
        if(to instanceof FindTheMostPopularTO){
            Fairytail result = ((FindTheMostPopularTO)to).getResultFairytail();
            if(result != null)
                System.out.println("The most popular fairytail is " + result.getTitle() + " with popularity " + result.getPopularity());
        }
        
        if(to instanceof FindBySizeTO){
            ArrayList<Fairytail> result = ((FindBySizeTO)to).getFairytails();
            if(result.size() > 0){
                System.out.println("for size " + ((FindBySizeTO)to).getSize() + " was found: ");
                for(int i = 0; i < result.size(); ++i)
                    System.out.println(result.get(i).getTitle()+ " with size " + result.get(i).getSize());
            }
        }
        
    }
}
