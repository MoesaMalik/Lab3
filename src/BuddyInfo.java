
public class BuddyInfo {
    private String address;
    private String name;
    private String phoneNumber;
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("Student", "101 Error", "613-000-0000");
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber(){ return phoneNumber; }

    public static void main(String[] args) {
        System.out.println("Hello word!");
        BuddyInfo s1 = new BuddyInfo("Hommer", "10 Daly", "911");
        System.out.println("Hello " + s1.getName());
    }
}
