package models;

public class Room extends Service {
    private String freeService;

    public Room() {
    }

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, String area, String rentalCost, String maxPeople, String rentalType, String freeService) {
        super(id, serviceName, area, rentalCost, maxPeople, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() +
                "#" + freeService;

    }

    @Override
    public String showInfor() {
        return " Room { " +
                super.showInfor() +
                ", Dịch vụ Miễn Phí Đi Kèm ='" + freeService + '\'' +
                '}';
    }
}
