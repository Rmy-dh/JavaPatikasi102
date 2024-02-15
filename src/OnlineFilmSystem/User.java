package OnlineFilmSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    //Attributes of user
    private String name;
    private double account;

    //If the user purchases a movie it will be added to this list
    List<Film> userFilmListForSell =new ArrayList<>();

    User(String name, double price){
        this.name=name;
        this.account =price;
    }
    public void addFilmToList(Film film){
        userFilmListForSell.add(film);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }


}
