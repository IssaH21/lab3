import java.util.ArrayList;


public class AddressBook {
	
	private ArrayList<BuddyInfo> addressBk;
	
	public AddressBook(){
		this.addressBk = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddyInfo){
		
		if(buddyInfo!=null){
			addressBk.add(buddyInfo);
		}
		
	}
	
	public void removeBuddy(int index){
		
		if(index>=0&&index<addressBk.size()){
			addressBk.remove(index);
		}
		
		
	}
	
	public static void main(String[] args){
		AddressBook a = new AddressBook();
		BuddyInfo b = new BuddyInfo("i","l","8");
		a.addBuddy(b);
		a.removeBuddy(0);
		
		System.out.println("Address Book");
	}
	

}
