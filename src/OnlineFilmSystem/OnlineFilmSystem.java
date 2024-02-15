package OnlineFilmSystem;

public class OnlineFilmSystem {
    public static void main(String[] args) {

        //Film and user generated

        User user1=new User("User1",100.0);
        User user2=new User("User2",99.0);
        Film film1=new Film("Film1","Director1",50,120,6);
        Film film2=new Film("Film2","Director2",100,30,7);
        Film film3=new Film("Film3","Director3",40,60,8);

        //Films and users are added to list

        FilmAndUserLists filmAndUserLists=new FilmAndUserLists();
        filmAndUserLists.addFilmToList(film1);
        filmAndUserLists.addFilmToList(film2);
        filmAndUserLists.addFilmToList(film3);
        filmAndUserLists.addUserToList(user1);
        filmAndUserLists.addUserToList(user2);

        //select 1 user and go simulation

        BuyAndRentFilms buyAndRentFilms=new BuyAndRentFilms(user1,filmAndUserLists);

        FilmSystemConditionSelection filmSystemConditionSelection=new FilmSystemConditionSelection(filmAndUserLists,user1,buyAndRentFilms);
        filmSystemConditionSelection.runFilmSimulation();
    }
}
