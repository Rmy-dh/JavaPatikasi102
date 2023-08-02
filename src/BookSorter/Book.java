package BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Book implements Comparable<Book> {
    private String name;
    private int pageNumber;
    private  String authorName;
    private int releaseDate;
    public Book(String name,int pageNumber,String authorName,int releaseDate){
        this.name=name;
        this.pageNumber=pageNumber;
        this.authorName=authorName;
        this.releaseDate=releaseDate;
    }
    @Override
    public int compareTo(Book o){
        //return this.getPageNumber()-o.getPageNumber();   =>SORTED BY PAGE NUMBER
        return  this.getName().compareTo(o.getName());      // SORTED BY NAME
    }

    public String getName(){
        return this.name;
    }
    public  int getPageNumber(){
        return this.pageNumber;
    }
    public String getAuthorName(){
        return this.authorName;
    }
    public int getReleaseDate(){
        return this.releaseDate;
    }




}
