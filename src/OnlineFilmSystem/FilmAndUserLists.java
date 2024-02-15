package OnlineFilmSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FilmAndUserLists {
    //listOfFilms for film and price of film information
    private final HashMap<Film,Double> listOfFilms=new HashMap<>();
    //listOfUser keeps users
    private final ArrayList<User> listOfUser=new ArrayList<>();
    public void addFilmToList(Film film){
        this.listOfFilms.put(film,film.getPrice());
    }
    public void addUserToList(User user){
        this.listOfUser.add(user);
    }

    public HashMap<Film, Double> getListOfFilms() {
        return listOfFilms;
    }

    public ArrayList<User>  getListOfUser(){

        return this.listOfUser;
    }
    public Film getFilm(String name){
        for(Map.Entry<Film,Double> entry:this.listOfFilms.entrySet()){
            if(entry.getKey().getName().toLowerCase().equals(name)){
                return entry.getKey();
            }
        }
        System.out.println("Film not found.");
        return  null;
    }

}
