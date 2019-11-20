package hello;
public class EqSearch{

    private int distance;
    private int minmag;

    public EqSearch() {  
        this.distance = 0;   
        this.minmag = 0;     
    }   

    public int getDistance()
    {
        return this.distance;
    }

    public int getMinmag()
    {
        return this.minmag;
    }

    public void setDistance(int a)
    {
        this.distance = a;
    }

    public void setMinmag(int a)
    {
        this.minmag = a;
    }

}
