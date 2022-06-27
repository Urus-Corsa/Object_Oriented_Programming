public class Address {


    private int StreetNum;
    private String StreetName;
    private String City;
    private String Zip;
    private String State;



    public Address(int streetNum, String streetName, String city, String zip, String state) {

        StreetNum = streetNum;
        StreetName = streetName;
        City = city;
        Zip = zip;
        State = state;
    }



    public int getStreetNum() {
        return StreetNum;
    }

    public String getStreetName() {
        return StreetName;
    }

    public String getCity() {
        return City;
    }

    public String getZip() {
        return Zip;
    }

    public String getState() {
        return State;
    }

    public void setStreetNum(int streetNum) {
        StreetNum = streetNum;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public void setCity(String city) {
        City = city;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public void setState(String state) {
        State = state;
    }

    public String toString() {
        return StreetNum + " ," + StreetName + " ," + City + " ," + Zip +

                " ," + State + "\n";
    }

}
