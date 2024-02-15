package OnlineFilmSystem;

import java.util.ArrayList;
import java.util.List;

public class Subscriber extends User{
    private final List<Film> userFilmListForRent =new ArrayList<>();
    private double creditAccount;
    Subscriber(String name, double price) {
        super(name, price);
    }
    public void addFilmToListForRent(Film film){
        if(isExist(film)){
            this.userFilmListForRent.add(film);
        }else{
            System.out.println("You already have this movie");
        }

    }
    public double getCreditAccount() {
        return creditAccount;
    }
    public void setCreditAccount(double creditAccount) {
        this.creditAccount = creditAccount;
    }
    public boolean isExist(Film film){
        for (Film film1:this.userFilmListForRent){
            if(film1==film){
                return false;
            }
        }
        return true;
    }
}
