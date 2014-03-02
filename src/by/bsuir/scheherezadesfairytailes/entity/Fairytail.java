package by.bsuir.scheherezadesfairytailes.entity;

public class Fairytail {
    private final int size;
    private final int popularity;
    
    public Fairytail(int size,int popularity){
        this.popularity = popularity;
        this.size = size;
    }
    
    public int getSize(){
        return size;
    }
    
    public int getPopularity(){
        return popularity;
    }
}
            
}
