package Tanaka;

import Tanaka.CatsList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CatsListData {


    public static void main(String[] args) {
        CatsList c1 = new CatsList();
        c1.setVinNum(11);
        c1.setModel("White");

        CatsList c2 = new CatsList();
        c2.setVinNum(22);
        c2.setModel("Grey");

        CatsList c3 = new CatsList();
        c3.setVinNum(33);
        c3.setModel("Black");

        CatsList c4 = new CatsList();
        c4.setVinNum(33);
        c4.setModel("Brown");

        List AllowingCatsDuplicates = new ArrayList();
        AllowingCatsDuplicates.add(c1);
        AllowingCatsDuplicates.add(c2);
        AllowingCatsDuplicates.add(c3);
        AllowingCatsDuplicates.add(c4);

        System.out.println("The Cats in the list are " + AllowingCatsDuplicates.size());


        Set NoCatsDuplicates = new HashSet();
        NoCatsDuplicates.add(c1);
        NoCatsDuplicates.add(c2);
        NoCatsDuplicates.add(c3);
        NoCatsDuplicates.add(c4);

        System.out.println("The Cats in the list are  " + NoCatsDuplicates.size());

    }


}