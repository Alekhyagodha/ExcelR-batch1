import java.util.ArrayList;

public class Demo024 {
class FriendList {
    ArrayList<String[]> list = new ArrayList<>();

    public FriendList() {
        list.add(new String[] { "alekhya", "1111111111", "Hyderabad" });
        list.add(new String[] { "swetha", "2222222222", "Hyderabad" });
        list.add(new String[] { "sowmya", "3333333333", "Hyderabad" });
        list.add(new String[] { "jyothi", "4444444444", "Hyderabad" });
        list.add(new String[] { "spoorthi", "5555555555", "Hyderabad" });
    }

    public void displayFriends() {
        for (String[] friend : list) {
            System.out.println("Name: " + friend[0]);
            System.out.println("Phone Number: " + friend[1]);
            System.out.println("Address: " + friend[2]);
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
        Friends friends = new Friends();
        Friends.displayFriends();
    }
}

