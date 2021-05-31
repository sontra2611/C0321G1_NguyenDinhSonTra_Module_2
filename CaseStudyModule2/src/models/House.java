package models;

public class House extends Service {
    private String roomStandard;
    private String otherAmenities;
    private String numberFloors;

    public House() {
    }

    public House(String roomStandard, String describe, String numberFloors) {
        this.roomStandard = roomStandard;
        this.otherAmenities = describe;
        this.numberFloors = numberFloors;
    }

    public House(String id, String serviceName, String area, String rentalCost, String maxPeople, String rentalType, String roomStandard, String otherAmenities, String numberFloors) {
        super(id, serviceName, area, rentalCost, maxPeople, rentalType);
        this.roomStandard = roomStandard;
        this.otherAmenities = otherAmenities;
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
                "#" + numberFloors;
    }

    @Override
    public String showInfor() {
        return "House { " +
                super.showInfor() +
                ", Tiêu Chuẩn Phòng = '" + roomStandard + '\'' +
                ", Tiện Nghi Khác = '" + otherAmenities + '\'' +
                ", Số Tầng = '" + numberFloors + '\'' +
                '}';
    }
}
