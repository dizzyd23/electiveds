package Conwyn;

import Conwyn.SportSeasonList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SportSeasonListData {


    public static void main(String[] args) {
        SportSeasonList SS1 = new SportSeasonList();
        SS1.setNum(11);
        SS1.setType("Season1");

        SportSeasonList SS2 = new SportSeasonList();
        SS2.setNum(22);
        SS2.setType("Season2");

        SportSeasonList SS3 = new SportSeasonList();
        SS3.setNum(33);
        SS3.setType("Season3");

        SportSeasonList SS4 = new SportSeasonList();
        SS4.setNum(33);
        SS4.setType("Season 3");

        ArrayList AllowingSportSeasonDuplicates = new ArrayList();
        AllowingSportSeasonDuplicates.add(SS1);
        AllowingSportSeasonDuplicates.add(SS2);
        AllowingSportSeasonDuplicates.add(SS3);
        AllowingSportSeasonDuplicates.add(SS4);

        System.out.println("The SportSeason in the list are " + AllowingSportSeasonDuplicates.size());


        Set NoFishDuplicates = new HashSet();
        NoFishDuplicates.add(f1);
        NoFishDuplicates.add(f2);
        NoFishDuplicates.add(f3);
        NoFishDuplicates.add(f4);

        System.out.println("The Fish in the list are  " + NoFishDuplicates.size());

    }


}