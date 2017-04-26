import Place.*;

import java.util.ArrayList;
import java.util.List;

public class Game {

    String [] maps = {"S","0","0","0","0","0","0","0","0","0","0","0","0","0","H","0","0","0","0","0","0","0","0","0","0","0","0","0","T"};
    public List GameMap = new ArrayList<Land>();;

    public void init() {

        StartPoint stratPoint = new StartPoint();
        this.GameMap.add(stratPoint);

        for (int i = 1; i < 14; i++) {
            House houseInArea1 = new House(i, 200);
            this.GameMap.add(houseInArea1);
        }

        Hotel hotel = new Hotel(14);
        this.GameMap.add(hotel);

        for (int i = 15; i < 28; i++) {
            House houseInArea2 = new House(i, 200);
            this.GameMap.add(houseInArea2);
        }

        ToolsRoom toolsRoom = new ToolsRoom(28);
        this.GameMap.add(toolsRoom);

        for (int i = 29; i < 35; i++) {
            House houseInArea3 = new House(i, 500);
            this.GameMap.add(houseInArea3);
        }

        GiftRoom giftRoom = new GiftRoom(35);
        this.GameMap.add(giftRoom);

        for (int i = 36; i < 49; i++) {
            House houseInArea4 = new House(i, 300);
            this.GameMap.add(houseInArea4);
        }

        Jail jail = new Jail(49);
        this.GameMap.add(jail);

        for (int i = 50; i < 63; i++) {
            House houseInArea5 = new House(i, 300);
            this.GameMap.add(houseInArea5);
        }

        MagicRoom magicRoom = new MagicRoom(63);
        this.GameMap.add(magicRoom);

        for (int i = 64; i < 70; i++) {
            Mine mine = new Mine(i);
            this.GameMap.add(mine);
        }
    }
}
