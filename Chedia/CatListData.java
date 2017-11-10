package Chedia;

import Chedia.CatList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CatListData {


    public static void main(String[] args) {
        CatList f1 = new CatList();
        f1.setBreed("Siamese");
        f1.setColour("Brown and cream");

        CatList f2 = new CatList();
        f2.setBreed("Cheshire");
        f2.setColour("Gray");

        CatList f3 = new CatList();
        f3.setBreed("Persian");
        f3.setColour("White");

        CatList f4 = new CatList();
        f4.setBreed("Egyption mau");
        f4.setColour("Gray and black spotted");

        ArrayList AllowingCatDuplicates = new ArrayList();
        AllowingCatDuplicates.add(f1);
        AllowingCatDuplicates.add(f2);
        AllowingCatDuplicates.add(f3);
        AllowingCatDuplicates.add(f4);

        System.out.println("The Cats in the list are " + AllowingCatDuplicates.size());


        Set NoCatDuplicates = new HashSet();
        NoCatDuplicates.add(f1);
        NoCatDuplicates.add(f2);
        NoCatDuplicates.add(f3);
        NoCatDuplicates.add(f4);

        System.out.println("The Cat in the list are  " + NoCatDuplicates.size());

    }


}