package Rowan;

import Rowan.SmartphonesList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmartphonesListData {


    public static void main(String[] args) {
        SmartphonesList c1 = new SmartphonesList();
        c1.setVinNum(11);
        c1.setModel("Nokia");

        SmartphonesList c2 = new SmartphonesList();
        c2.setVinNum(22);
        c2.setModel("iPhone");

        SmartphonesList c3 = new SmartphonesList();
        c3.setVinNum(33);
        c3.setModel("Huawei");

        SmartphonesList c4 = new SmartphonesList();
        c4.setVinNum(33);
        c4.setModel("Samsung");

        List AllowingCarDuplicates = new ArrayList();
        AllowingSmartphonesDuplicates.add(c1);
        AllowingSmartphonesDuplicates.add(c2);
        AllowingSmartphonesDuplicates.add(c3);
        AllowingSmartphonesDuplicates.add(c4);

        System.out.println("The Smartphones in the list are " + AllowingSmartphonesDuplicates.size());


        Set NoSmartphonesDuplicates = new HashSet();
        NoSmartphonesDuplicates.add(c1);
        NoSmartphonesDuplicates.add(c2);
        NoSmartphonesDuplicates.add(c3);
        NoSmartphonesDuplicates.add(c4);

        System.out.println("The Smartphones in the list are  " + NoSmartphonesDuplicates.size());

    }


}