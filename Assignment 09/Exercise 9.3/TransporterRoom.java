import java.util.Random;

public class TransporterRoom extends Room {

    public TransporterRoom(String description) {
        super(description);
    }

    @Override
    public Room getExit(String direction) {
        return generateRandomRoom();
    }

    private Room generateRandomRoom() {
        Random random = new Random();

        int number = random.nextInt(3);

        String direction = "";

        switch (number) {
            case 0:
                direction = "north";
                break;

            case 1:
                direction = "east";
                break;

            case 2:
                direction = "south";
                break;

            case 3:
            default:
                direction = "west";
                break;
        }

        Room newRoom = new TransporterRoom("description");
        newRoom.setExit(direction, this);

        return newRoom;
    }
}
