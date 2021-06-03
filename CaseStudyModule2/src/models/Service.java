package models;

public abstract class Service {
    private String id;
    private String serviceName;
    private String area;
    private String rentalCost;
    private String maxPeople;
    private String rentalType;

    public Service() {
    }

    public Service(String id, String serviceName, String area, String rentalCost, String maxPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(String rentalCost) {
        this.rentalCost = rentalCost;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String toString() {
        return id +
                "#" + serviceName +
                "#" + area +
                "#" + rentalCost +
                "#" + maxPeople +
                "#" + rentalType;
    }

    public String showInfor() {
        return
                " Id = '" + id +
                        ", Tên Dịch vụ = '" + serviceName + '\'' +
                        ", Diện tích sử dụng = '" + area + '\'' +
                        ", Chi Phí Thuê = '" + rentalCost + '\'' +
                        ", Số Người Tối Đa = '" + maxPeople + '\'' +
                        ", Kiểu Thuê = '" + rentalType + '\'';
    }
}
