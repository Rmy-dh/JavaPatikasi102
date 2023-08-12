package ThreadRace;

import java.util.ArrayList;


public class BackOfTheThreadRace implements Runnable{
    private final Object LOCK =new Object();
    private int number=1;

    private ArrayList<Integer> list1=new ArrayList<>();
    private ArrayList<Integer> list2=new ArrayList<>();
    private ArrayList<Integer> list3=new ArrayList<>();
    private ArrayList<Integer> list4=new ArrayList<>();

    private ArrayList<Integer> oddList=new ArrayList<>();
    private ArrayList<Integer> evenList=new ArrayList<>();

    @Override
    public void run() {
        synchronized (LOCK){
            if (number<=3){
                list1.add(number);

            }else if(number<=6  && number>3){

                list2.add(number);
            }else if (number<=9 && number>6){

                list3.add(number);
            }else if(number<=12 && number>9){

                list4.add(number);
            }
            if(number%2==0){
                evenList.add(number);
            }else {
                oddList.add(number);
            }
            number=number+1;

        }

    }

    public ArrayList<Integer> getOddList(){
        return oddList;
    }
    public void  setOddList(ArrayList<Integer> oddList){
        this.oddList=oddList;
    }
    public ArrayList<Integer> getEvenList(){
        return evenList;
    }
    public void setEvenList(ArrayList<Integer> evenList){
        this.evenList=evenList;
    }


    public ArrayList<Integer> getList1() {
        return list1;
    }

    public void setList1(ArrayList<Integer> list1) {
        this.list1 = list1;
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
