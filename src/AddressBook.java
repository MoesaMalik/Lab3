import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> buddies;

    public static void main(String[] args){
            BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");
            AddressBook addressBook = new AddressBook();
            addressBook.addBuddy(buddy);
            addressBook.removeBuddy(buddy);
    }
    public AddressBook(){
        buddies = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        if(buddy != null)
            buddies.add(buddy);
    }

    public boolean removeBuddy(BuddyInfo buddy){

        return buddies.remove(buddy);
    }

}
