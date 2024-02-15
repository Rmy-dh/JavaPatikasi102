package OnlineFilmSystem;

import java.util.Scanner;

public class FilmSystemConditionSelection {
    public Scanner input=new Scanner(System.in);
    public FilmAndUserLists filmAndUserLists;
    public  BuyAndRentFilms buyAndRentFilms;
    public  User user;
    public String menu="1-User List\n2-Film  List\n3-Make User To Subscriber\n4-Buy new Film\n5-Log Out!";
    public String subscriberMenu="1-Rent The Movie\n2-Buy Credit";
    int condition;
    public Subscriber subscriber;
    public   boolean check=true,checkSucscriber=true;
    public FilmSystemConditionSelection(FilmAndUserLists filmAndUserLists,User user,BuyAndRentFilms buyAndRentFilms){
        this.filmAndUserLists=filmAndUserLists;
        this.buyAndRentFilms=buyAndRentFilms;
        this.user=user;
    }
    public  void runFilmSimulation(){
        System.out.println("---------Welcome---------");
        while (check){
            System.out.println(menu);
            System.out.print("Please select your process: ");
            this.condition=input.nextInt();
            System.out.println("---------------------------------------------");
            if(this.condition>=5 || this.condition<1){
                check=false;
                System.out.println("Good by");
                break;
            }
            runWithCondition();
        }
    }
    public void runWithCondition(){
        switch (condition){
            case 1:
                this.buyAndRentFilms.printUserInformation();
                System.out.println("---------------------------------------------");
                break;
            case 2:

                this.buyAndRentFilms.printFilmList();
                System.out.println("---------------------------------------------");
                break;
            case 3:
                if(checkSucscriber){
                    //is not a subscriber
                    subscriber = this.buyAndRentFilms.makeSubscriber(this.user);
                    checkSucscriber=false;

                }else{
                    //is a subscriber
                    System.out.println("You are already subscriber.");
                }
                System.out.println(subscriberMenu);
                System.out.print("Please select your process: ");
                this.condition=input.nextInt();
                subscriberConditionSelection(subscriber,condition);
                break;

            case 4:
                this.buyAndRentFilms.printFilmList();
                System.out.println("---------------------------------------------");
                System.out.println("You have -> "+this.user.getAccount()+" account");
                System.out.print("Enter movie:");
                String filmName=input.next().toLowerCase();
                this.buyAndRentFilms.buyFilm(this.filmAndUserLists.getFilm(filmName),this.user);
                break;
        }

    }
    public void subscriberConditionSelection(Subscriber subscriber,int condition){
        if(condition==1){
            //rent films
            System.out.println("---------------------------------------------");
            this.buyAndRentFilms.printFilmList();
            System.out.println("---------------------------------------------");
            System.out.println("You have -> "+this.subscriber.getCreditAccount()+" creditAccount");
            System.out.print("Enter movie:");
            String filmName=input.next().toLowerCase();
            this.buyAndRentFilms.rentFilm(this.filmAndUserLists.getFilm(filmName),subscriber);

        }else if(condition==2){
            //buy credit
            System.out.print("Enter credit: ");
            Double credit=input.nextDouble();
            this.buyAndRentFilms.subscriberTakeCredit(credit,subscriber);

        }else{
            System.out.println("Your selection wrong.");
        }
        System.out.println("---------------------------------------------");

    }

}
