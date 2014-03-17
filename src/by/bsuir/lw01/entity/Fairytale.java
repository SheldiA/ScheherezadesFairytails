package by.bsuir.lw01.entity;
/**
 * 
 * @author Anna
 * class includes description for every fairytale
 */
public class Fairytale {
    private int size;
    private int popularity;
    private String title;
    
    /**
     * 
     * @param title is title of fairytale
     * @param size is number of character in fairytale
     * @param popularity is popularity of fairytale
     */
    public Fairytale(String title,int size,int popularity){
        this.title = title;
        this.popularity = popularity;
        this.size = size;
    }
    /**
     * 
     * @return size of fairytale
     */
    public int getSize(){
        return size;
    }
    /**
     * 
     * @return popularuty of fairytale
     */
    public int getPopularity(){
        return popularity;
    }
    /**
     * 
     * @return title of fairytale
     */
    public String getTitle(){
        return title;
    }
}
