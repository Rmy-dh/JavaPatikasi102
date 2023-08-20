package PatikaStrore;

public  class   PatikaAPP {
    public int idNumber ;
    public double price ;
    public double tax ;
    public int stock=0; //ürün adeti
    public String name ;
    public double screenSize ;
    public int RAM;
    public String brand1;
    public int storage ;
    public static String[] brand = {"Samsung", "Lenova", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiomi", "Monster"};

    public PatikaAPP(int idNumber,String name,double price,String brand1,
                     int storage,double screenSize,int RAM ){
        this.idNumber=idNumber;
        this.name=name;
        this.price=price;
        this.brand1=brand1;
        this.storage=storage;
        this.screenSize=screenSize;
        this.RAM=RAM;


    }
}

