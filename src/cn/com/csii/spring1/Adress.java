package cn.com.csii.spring1;

/**
 * Created by Administrator on 2016/8/2.
 */
public class Adress {
    private String city;
    private String road;
    private String houseNumber;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRoad() {
        return road;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", road='" + road + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                '}';
    }
}
