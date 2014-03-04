package by.bsuir.scheherezadesfairytales.entity;

public class Fairytale {
    private final int size;
    private final int popularity;
    private final String title;
    
    public Fairytale(String title,int size,int popularity){
        this.title = title;
        this.popularity = popularity;
        this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    public int getPopularity(){
        return popularity;
    }
    
    public String getTitle(){
        return title;
    }
}
