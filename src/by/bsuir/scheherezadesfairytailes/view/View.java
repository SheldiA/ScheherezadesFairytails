package by.bsuir.scheherezadesfairytailes.view;
import by.bsuir.scheherezadesfairytailes.controller.AddTO;
import by.bsuir.scheherezadesfairytailes.controller.Controller;
import by.bsuir.scheherezadesfairytailes.controller.FindTheMostPopularTO;
import by.bsuir.scheherezadesfairytailes.controller.TO;
import by.bsuir.scheherezadesfairytailes.entity.Fairytail;
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
        requests.add(new AddTO(1, new Fairytail(100,5), false));
        requests.add(new AddTO(1, new Fairytail(200,7), false));
        requests.add(new AddTO(1, new Fairytail(150,3), false));
        requests.add(new FindTheMostPopularTO(2, null));
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
            if(((AddTO)to).isResult())
                System.out.println("Addition was successful");
        if(to instanceof FindTheMostPopularTO){
            Fairytail result = ((FindTheMostPopularTO)to).getResultFairytail();
            if(result != null)
                System.out.println("The most popular fairytail was found with popularity " + result.getPopularity());
        }
        
    }
}
