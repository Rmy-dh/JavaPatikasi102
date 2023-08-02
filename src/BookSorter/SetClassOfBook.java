package BookSorter;

import java.util.*;

public class SetClassOfBook {
    public static void main(String[] args) {
        Set<Book> book=new TreeSet<>();

        book.add(new Book("Suç ve Ceza",687,"Dostoyevski",1866));
        book.add(new Book("Bir Kadın Düşmanı",172,"Reşat Nuri Güntekin",1927));
        book.add(new Book("İvan İlyiç'in Ölümü",110,"Tolstoy",1886));
        book.add(new Book("Palto",88,"Nikolay Gogol",1842));
        book.add(new Book("Küçük Prens",124,"Antonie de Saint-Exupery",1943));
        for (Book book1:book){
            System.out.println(book1.getName());
        }



    }
}
