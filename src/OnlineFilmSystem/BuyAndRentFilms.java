package OnlineFilmSystem;

import java.util.Map;

public class BuyAndRentFilms {
    private final  FilmAndUserLists filmAndUserLists;
    private final User user;
    private  Subscriber subscriber;
    BuyAndRentFilms(User user,FilmAndUserLists filmAndUserLists){
        this.filmAndUserLists=filmAndUserLists;
        this.user=user;

    }
    public Subscriber makeSubscriber(User user){
        //Subscription fee:20
        if(this.user.getAccount() >= 20 ){
            this.subscriber=new Subscriber(user.getName(),user.getAccount());
            this.subscriber.setAccount(this.subscriber.getAccount()-20);
            this.subscriber.setCreditAccount(20);
            changeListValueByChangingAccount(subscriber);

        }
        System.out.println("Now you have "+this.subscriber.getCreditAccount()+" credit account , left money : "+this.subscriber.getAccount());
        System.out.println("---------------------------------------------");
        return this.subscriber;
    }
    public void subscriberTakeCredit(Double credit,Subscriber subscriber){
        // if subscriber has enough money and gives correct credit account
        if(credit>0 && subscriber.getAccount()>credit){
            subscriber.setCreditAccount(subscriber.getCreditAccount()+credit);
            subscriber.setAccount(subscriber.getAccount()-credit);
            changeListValueByChangingAccount(subscriber);
        }
    }

    public void buyFilm(Film film,User user){
        if(this.filmAndUserLists.getListOfFilms().get(film) <= user.getAccount() ){
            this.user.addFilmToList(film);
            this.user.setAccount((user.getAccount()-film.getPrice()));
            System.out.println("Congratulations , Watch movie");
            changeListValueByChangingAccount(user);
        }else{
            System.out.println("Not have enough money or not correct film name given from you !");
        }
        System.out.println("---------------------------------------------");

    }
    public void rentFilm(Film film,Subscriber subscriber){

        if(this.filmAndUserLists.getListOfFilms().get(film) <= subscriber.getCreditAccount()){
            this.subscriber.addFilmToListForRent(film);
            this.subscriber.setCreditAccount(subscriber.getCreditAccount()-film.getPrice());
            System.out.println("Congratulations , Watch movie");
            changeListValueByChangingAccount(subscriber);
        }else{
            System.out.println("Not have enough credit account");
        }


    }
    public  void printFilmList(){
        for(Map.Entry<Film,Double> entry:this.filmAndUserLists.getListOfFilms().entrySet()){
            System.out.println(entry.getKey().getName()+" -> "+entry.getValue());
        }
    }
    public  void printUserInformation(){
        for(User user:this.filmAndUserLists.getListOfUser()){
            System.out.println(user.getName()+" -> "+user.getAccount());
        }
    }
    //For changes in user account information to be reflected in the list
    public void changeListValueByChangingAccount(User user){
        for(User user1:this.filmAndUserLists.getListOfUser()){
            if(user1.getName().equals(user.getName())){
                user1.setAccount(user.getAccount());
            }
        }
    }

}
