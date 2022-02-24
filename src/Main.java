import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.sort;

public class Main  {
    public static void main(String[] args) {
//        Comparator<Stu> byAge=new Comparator<Stu>() {
//            @Override
//            public int compare(Stu o1, Stu o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        };
        Stu stu1 = new Stu("Duy",16,"HN");
        Stu stu2 = new Stu("DuyNen",19,"HN");
        Stu stu3 = new Stu("DuyNhat",3,"HN");

        ArrayList<Stu> listStu = new ArrayList<>();
        listStu.add(stu1);
        listStu.add(stu2);
        listStu.add(stu3);

//        listStu.sort(byAge);
//        displayList(listStu);

        Stu stu4 = new Stu("DuyCauGiay",77,"HN");
        Stu stu5 = new Stu("DuyTan",5,"HN");
        listStu.add(stu5);
        listStu.add(stu4);

//        sort(listStu,byAge);
//        System.out.println("\n");
//        displayList(listStu);

        Stu stu6 = new Stu("DuyTu",5,"HN");
        Stu stu7 = new Stu("DuyTam",18,"HN");
        listStu.add(stu6);
        listStu.add(stu7);
        sort(listStu);
        displayList(listStu);
    }
    public static void displayList(ArrayList<Stu> list){
        for (Stu e:list
             ) {
            System.out.println(e);
        }
    }
}
