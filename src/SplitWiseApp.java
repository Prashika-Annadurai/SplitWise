import java.util.Scanner;
public class SplitWiseApp{
    public static void main(String args[]){
        System.out.println("===SPLITWISE CONSOLE===");
        System.out.println("Track shared expenses with Friends");
        System.out.println("Ready.More features coming in the next lesson.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Who paid?");
        String payerName=sc.nextLine();
        System.out.println("Total amount(₹):");
        double totalAmount=sc.nextDouble();
        int numFriends=3;
        double perPersonShare=totalAmount/numFriends;
        String expenseLine="%s paid ₹%.2f".formatted(payerName,totalAmount);
        String shareLine="Each person pays: %.2f".formatted(perPersonShare);
        System.out.println(expenseLine);
        System.out.println(shareLine);
    }
}
