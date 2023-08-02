package MatchFixture;

import java.util.ArrayList;
import java.util.List;

public class Fixture {
    List<String> home=new ArrayList();
    List<String> guest=new ArrayList();
    List<String> First=new ArrayList<>();    //Match team arraylist

    Fixture(List<String> home,List<String> guest){
        this.home=home;this.guest=guest;
    }
    public void Round(){
        if((home.size()+guest.size())%2 !=0 ){
            if(home.size()>guest.size()){
                guest.add("Bay");
            }else{
                home.add("Bay");
            }
        }
        int number=(home.size()+guest.size()-1)*2;
        int i=1;
        match();

        for(String str:First){
            while (i<=number){                          //Print the information of arraylist

                System.out.println("---------"+"Round "+i+"---------");
                System.out.println(str);
                i++;
                break;
            }

        }
        System.out.println("*********THE END*********");

    }
    public void match(){


        for(int j=0;j<home.size();j++) {
            if (!First.contains((home.get(j) + " vs " + guest.get(j)))) {        //home=>guest
                First.add((home.get(j) + " vs " + guest.get(j)));
            }
        }

        for(int j=0;j<home.size();j++) {
            if (!First.contains((guest.get(j) + " vs " + home.get(j)))) {
                First.add((guest.get(j) + " vs " + home.get(j)));                //guest=>home
            }
        }

        for(int j=0;j<home.size()-1;j++) {
            if (!First.contains((guest.get(j) + " vs " + guest.get(j+1)))) {
                First.add((guest.get(j) + " vs " + guest.get(j+1)));               //guest=>guest
            }
        }

        for(int j=0;j<home.size()-1;j++) {
            if (!First.contains((home.get(j) + " vs " + home.get(j+1)))) {
                First.add((home.get(j) + " vs " + home.get(j+1)));                //home=>home
            }
        }



    }




}
