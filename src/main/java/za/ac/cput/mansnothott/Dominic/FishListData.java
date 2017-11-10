package Dominic;

import Dominic.FishList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FishListData {


    public static void main(String[] args) {
        FishList f1 = new FishList();
        f1.setNum(11);
        f1.setType("Great White");

        FishList f2 = new FishList();
        f2.setNum(22);
        f2.setType("Piranha");

        FishList f3 = new FishList();
        f3.setNum(33);
        f3.setType("Catfish");

        FishList f4 = new FishList();
        f4.setNum(33);
        f4.setType("Barracuda");

        ArrayList AllowingFishDuplicates = new ArrayList();
        AllowingFishDuplicates.add(f1);
        AllowingFishDuplicates.add(f2);
        AllowingFishDuplicates.add(f3);
        AllowingFishDuplicates.add(f4);

        System.out.println("The Fish in the list are " + AllowingFishDuplicates.size());


        Set NoFishDuplicates = new HashSet();
        NoFishDuplicates.add(f1);
        NoFishDuplicates.add(f2);
        NoFishDuplicates.add(f3);
        NoFishDuplicates.add(f4);

        System.out.println("The Fish in the list are  " + NoFishDuplicates.size());

    }


}