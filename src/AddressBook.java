import java.util.LinkedList;

public class AddressBook {

    private LinkedList<BuddyInfo> addressBook;

    public static void main(String[] args){
            BuddyInfo buddy = new BuddyInfo("Tom", "Carleton","613");
            AddressBook addressBook = new AddressBook();
            addressBook.addBuddy(buddy);
            addressBook.removeBuddy(buddy);
    }
    public AddressBook(){
        addressBook = new LinkedList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        addressBook.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        addressBook.remove(buddy);
    }

}
