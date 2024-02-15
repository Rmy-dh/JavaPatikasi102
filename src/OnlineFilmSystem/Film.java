package OnlineFilmSystem;

public class Film {
    // Attributes of film
    private String name;
    private final double price;
    public final int imdb;
    public final int time;
    public   final String director;

    Film(String name,String director,double price,int time,int imdb){
        this.name=name;
        this.director=director;
        this.price=price;
        this.time=time;
        this.imdb=imdb;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }


}
