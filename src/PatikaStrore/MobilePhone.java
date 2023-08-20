package PatikaStrore;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone extends PatikaAPP {
    public int memory;
    public double batteryPower;
    public String colour;

    //------constructor for mobile phone------

    public MobilePhone(int idNumber, String name, double price, String brand1,
                       int storage, double screenSize,double batteryPower,int RAM,String colour) {
        super(idNumber, name, price, brand1, storage, screenSize,RAM);

        this.batteryPower=batteryPower;
        this.colour=colour;

    }
     // Ürün listesi
    List<MobilePhone> arrayList=new ArrayList<>();

    public static void getBrand(){
        System.out.println("---------------------Markalarımız------------------");
        for (String str:brand){
            System.out.println("- "+str);
        }

    }


    public void addDevice(MobilePhone mobilePhone) {
                                                               //ürün ekleme
        arrayList.add(mobilePhone);
        System.out.println("Tabloya ürün eklendi.");
    }

    public void deleteDevice(int idNumber) {                    //ürün silme
        arrayList.remove(idNumber);
        System.out.println("İşlem başarılı bir şekilde gerçekleşt.Ürün bilgisi silindi.");
    }

    //Ürünleri tabloda gözlemleme
    public void printDevice() {
        System.out.println("---------------------------------------------------------------------------" +
                "-----------------------");
        System.out.println(" Cep Telefonu Listesi");
        System.out.println("----------------------------------------------------------------------------" +
                "-------------------------");
        System.out.println("|"+ " ID" +"|" +"      Ürün Adı      "+"   "+"|"+" Fiyat "+
                " | "+ " Marka "+" | "+ " Depolama "+  " | "+" Ekran"+"  |   "+" Pil "+"   |  "+"  RAM" +" | "+" Renk");
        System.out.println("---------------------------------------------------------------------------" +
                "--------------------------");

        for (MobilePhone mobilePhone :arrayList){

            System.out.println("| "+mobilePhone.idNumber+" | "+"    "+mobilePhone.name+"   "+mobilePhone.price+"   "
                    +mobilePhone.brand1+"     "
                    +mobilePhone.storage+"        "+mobilePhone.screenSize+"       "+mobilePhone.storage+
                    "          "+mobilePhone.RAM+"        "+mobilePhone.colour);
            System.out.println("----------------------------------------------------------------------" +
                    "---------------------------");


        }

    }
}
