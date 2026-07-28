import java.util.Scanner;
import java.util.ArrayList;
public class SplitWiseApp {
    public static void main(String args[]) {
        System.out.println("===SPLITWISE CONSOLE===");
        System.out.println("Track shared expenses with Friends");
        System.out.println("Ready.More features coming in the next lesson.");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> friends= new ArrayList<>();
        boolean running = true;
        while (running) {
            System.out.println("===Menu===");
            System.out.println("1.Record Expenses");
            System.out.println("2.Add friends");
            System.out.println("3.List Friends");
            System.out.println("0.Exit");
            System.out.println("choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    if(friends.isEmpty()) {
                        System.out.println("No friends yet.Add friends First");
                    }
                    System.out.println("Who paid?");
                    String payerName = sc.nextLine();
                    System.out.println("Total amount(₹):");
                    double totalAmount = sc.nextDouble();
                    int numFriends = friends.size();
                    double perPersonShare = totalAmount / numFriends;
                    String expenseLine = "%s paid ₹%.2f".formatted(payerName, totalAmount);
                    String shareLine = "Each person pays: %.2f".formatted(perPersonShare);
                    System.out.println(expenseLine);
                    System.out.println(shareLine);
                }
                case 2->{
                    AddFriend(sc , friends);
                }
                case 3->{
                    if(friends.isEmpty()) {
                        System.out.println("No friends yet");
                    }
                    else{
                        System .out.println("Friends:");
                        for(String names:friends)
                            System.out.println("-" + names);
                    }
                }
                case 0 -> {
                    System.out.println("Goodbye!");
                }
                default -> {
                    System.out.println("Invalid choice.Try Again");
                }


                    }
            }
        }
    public static void AddFriend(Scanner sc,ArrayList<String>friends){
        System.out.println("Friend Name:");
        String FriendName=sc.nextLine();
        friends.add(FriendName);
        System.out.println("Added " + FriendName + ".");

    }
    }




