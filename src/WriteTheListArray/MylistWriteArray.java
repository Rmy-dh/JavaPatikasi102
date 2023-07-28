package WriteTheListArray;

public class MylistWriteArray {
    public static void main(String[] args) {
        MyList<Integer> n1=new MyList<>();
        MyList<Integer>n2=new MyList<>(3);
        //capacity of array is 3 but we add more than 3
        n2.set(2,40);
        n2.set(1,55);
        n2.set(0,66);
        n2.add(10);
        n2.add(11);
        n2.add(31);
        n2.getArray();
        //The values after the deleted value will automatically scroll
        n2.delete(3);
        n2.delete(1);
        n2.getArray();
        n2.printAsArray();
        n2.sublist(2,6);
        System.out.println("-----------------------------------------------------------------");
        //if the value is in array ,it gives true
        System.out.println(n2.contains(40)? "TRUE":"FALSE");
        //if string empty is true
        System.out.println(n2.isEmpthy()? "TRUE":"FALSE");
        n2.getIndex(11);
        System.out.println(n2.size());
        n2.lastIndexOfData(40);

    }
}
