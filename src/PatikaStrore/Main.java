package PatikaStrore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int selection=1;


        //Objects
        MobilePhone m1=new MobilePhone(1,"SAMSUNG GALAXY A51",
                3199.0,"Samsung",128,6.5,
                40.0,6,"Siyah");

        NoteBook n1=new NoteBook(1,"HUAWEI Matebook 14",
                7000.0,"Huawei",512,14.0,16);

        NoteBook n2=new NoteBook(1,"HUAWEI Matebook 14",
                7000.0,"Huawei",512,14.0,16);


                                                              //Giriş paneli
        while (selection!=0 && selection<4){                 //Çıkış yapmak isteyene kadar devam eder

            System.out.println("Patika ürün yönetim paneli!");
            System.out.println("1-Notebook İşlemleri\n" + "2-Cep Telefonu İşlemler\n" +
                    "3-Marka Listele\n" + "0-Çıkış Yap");
            System.out.print("Tercihiniz: ");
            selection=input.nextInt();
            switch (selection){
                case 1:
                    n1.addDevice(n1);
                    n1.addDevice(n2);
                    //n1.deleteDevice(1);

                    n1.printDevice();
                    break;
                case 2:
                    m1.addDevice(m1);
                    m1.printDevice();
                    //m1.deleteDevice(0);

                    break;
                case 3:
                    m1.getBrand();         //markaları görme
                    break;
                default:
                    System.out.println("Hoşçakalın yine bekleriz...");
            }

        }

    }


}
