package models;

public class Villa extends Service {
    private String roomStandard;
    private String otherAmenities;
    private String swimmingPoolArea;
    private String numberFloors;

    public Villa() {
    }

    public Villa(String roomStandard, String otherAmenities, String swimmingPoolArea, String numberFloors) {
        this.roomStandard = roomStandard;
        this.otherAmenities = otherAmenities;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public Villa(String id, String serviceName, String area, String rentalCost, String maxPeople, String rentalType, String roomStandard, String describe, String swimmingPoolArea, String numberFloors) {
        super(id, serviceName, area, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.otherAmenities = describe;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberFloors = numberFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherAmenities() {
        return otherAmenities;
    }

    public void setOtherAmenities(String otherAmenities) {
        this.otherAmenities = otherAmenities;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(String numberFloors) {
        this.numberFloors = numberFloors;
    }

    @Override
    public String toString() {
        return super.toString() +
                "#" + roomStandard +
                "#" + otherAmenities +
                "#" + swimmingPoolArea +
                "#" + numberFloors;
    }

    @Override
    public String showInfor() {
        return "Villa { " +
                super.showInfor() +
                ", Ti??u Chu???n Ph??ng = '" + roomStandard + '\'' +
                ", Ti???n Nghi Kh??c = '" + otherAmenities + '\'' +
                ", Di???n T??ch H??? B??i = '" + swimmingPoolArea + '\'' +
                ", S??? T???ng = '" + numberFloors + '\'' +
                '}';
    }
}
