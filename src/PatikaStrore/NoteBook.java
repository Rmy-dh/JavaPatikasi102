package PatikaStrore;

import java.util.ArrayList;
import java.util.List;

public  class NoteBook extends PatikaAPP{

    // Ürün listesi

    List<NoteBook> arrayList1=new ArrayList<>();

    //------constructor for mobile phone------

    public NoteBook(int idNumber, String name, double price, String brand1,
                       int storage, double screenSize,int RAM) {
        super(idNumber, name, price, brand1, storage, screenSize,RAM);

    }


    public void addDevice(NoteBook noteBook) {
                                                                        //ürün ekleme

        arrayList1.add(noteBook);
        System.out.println("Tabloya ürün eklendi.");
    }

    public void deleteDevice(int idNumber) {                              //ürün silme
        arrayList1.remove(idNumber);
        System.out.println("İşlem başarılı bir şekilde gerçekleşti.Ürün bilgisi silindi.");

    }

    //Ürünleri tabloda gözlemleme

    public void printDevice() {

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println(" NoteBook Listesi");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("|"+ " ID" +"|" +"    Ürün Adı          "+"   "+"|"+" Fiyat "+
                    " | "+ " Marka "+" | "+ " Depolama "+  " | "+" Ekran"+"    | "+"RAM" );
        System.out.println("--------------------------------------------------------------------------------");

        for (NoteBook noteBook :arrayList1){

            System.out.println("| "+noteBook.idNumber+" | "+"    "+noteBook.name+"     "+noteBook.price+"     "
                    +noteBook.brand1+"      "
                    +noteBook.storage+"        "+noteBook.screenSize+"    "+noteBook.RAM);
            System.out.println("------------------------------------------------------------------------------");


        }


    }
}


