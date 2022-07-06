public class CarOwner {
    private String name;
    private int ownerID;
    private String lastName;

    public CarOwner(String name, int ownerID, String lastName) {
        this.name = name;
        this.ownerID = ownerID;
        this.lastName = lastName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
