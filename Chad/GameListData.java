package Chad;

import Chad .GameList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameListData {


    public static void main(String[] args) {
        GameList game1 = new GameList();
        game1.setSyncNum(11);
        game1.setModel("NBA 2K16");

        GameList game2 = new GameList();
        game2.setSyncNum(22);
        game2.setModel("FIFA 17");

        GameList game3 = new GameList();
        game3.setSyncNum(33);
        game3.setModel("Need For Speed");

        GameList game4 = new GameList();
        game4.setSyncNum(33);
        game4.setModel("Lamborghini");

        ArrayList AllowGameDuplicates = new ArrayList();
        AllowGameDuplicates.add(game1);
        AllowGameDuplicates.add(game2);
        AllowGameDuplicates.add(game3);
        AllowGameDuplicates.add(game4);

        System.out.println("These are the Games in this list " + AllowGameDuplicates.size());


        Set NonGameDuplicates = new HashSet();
        NonGameDuplicates.add(game1);
        NonGameDuplicates.add(game2);
        NonGameDuplicates.add(game3);
        NonGameDuplicates.add(game4);

        System.out.println("These are the Games in this list  " + NonGamesDuplicates.size());

    }


}