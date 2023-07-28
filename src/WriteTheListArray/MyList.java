package WriteTheListArray;

import java.util.Arrays;
public class MyList<T>{
    private  int capacity=10;    //default değeri 10
    private T[] arr;
    public MyList(){
        this.arr=(T[]) new Object[this.capacity];    //Array lenght 10;
    }
    public MyList(int capacity){
        this.capacity=capacity;
        this.arr=(T[]) new Object[this.capacity];  //Array lenght is new capacity value;
    }
    public T[] getArr(){
        return arr;
    }
    public void setArr(T[] arr){
        this.arr=arr;
    }                                   //GETTER AND SETTER METHOS OF PARAMETERS.
    public int getCapacity(){
        return this.capacity;
    }
    public void setCapacity(int capacity){
        this.capacity=capacity;
    }
    public int size(){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!= null){                    //The size of array (if value not egual null value )
                count++;
            }
        }
        return count;
    }
    public boolean isEmpthy(){
        for(int i=0;i<arr.length;i++){              //isEmpty() Metodu
            if(arr[i]!=null){
                return false;
            }
        }
        return true;
    }
    public void clear(){
        Arrays.fill(arr,null);
        getArray();                           //Clear all variables of arr
    }
    public void add(T data){
        if (size()==this.capacity){
            this.capacity=this.capacity*2;             //Add the number to arr
            arr=Arrays.copyOf(arr,this.capacity);
        }
        arr[size()]=data;
    }
    public void delete(int index){
        if (index>0 ||index<arr.length){
            arr[index]=null;                          //delete element
            for (int i=index+1;i<arr.length;i++){
                arr[i-1]=arr[i];
                if(arr.length-1==i){
                    arr[(arr.length-1)]=null;
                }
            }
        }
    }
    public void getIndex(T value){
        for(int i=0;i<arr.length;i++){
            if (arr[i]==value){
                System.out.println(i);
                break;
            }else if(arr[i]!=null){                //Give the index of given value
                if(i==(arr.length-1)){
                    System.out.println("-1");
                }
            }
        }
    }
    public T getIntIndex(int index){
        if(index<0 ||index>arr.length){          //give element by index
            return null;
        }
        return arr[index];
    }
    public void set(int index,T data){
        if(index<0  ||index>arr.length){
            System.out.println("null");
        }else{
            if(size()==index  ||size()<index){
                this.capacity=capacity*2;           //if capacity not enough for new value
                arr=Arrays.copyOf(arr,capacity);
            }
            arr[index]=data;
        }
    }
    public  void getArray(){
        System.out.println(Arrays.toString(arr));        //Give the array list

    }
    public void lastIndexOfData(T data){
        for(int i=(arr.length-1);i>=0;i--){

            if (data.equals(arr[i])){

                System.out.println(i);
                break;                       //last index of given data
            }else if(arr[i]!=null){
                if(i==0){
                    System.out.println(-1);
                }
            }
        }
    }
    public void printAsArray(){
        T[] array=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(array));     //write the array
    }
    public  void sublist(int start,int finish){
        T[] array =Arrays.copyOfRange(arr,start,finish);
        System.out.println(Arrays.toString(array));         //sublist of given array
    }
    public boolean contains(T data){             //Given data on array or not
        for(T i:arr){
            if(i==data){
                return true;
            }
        }
        return false;
    }

}
