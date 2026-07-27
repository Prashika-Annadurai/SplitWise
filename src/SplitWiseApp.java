public class SplitWiseApp{
    public static void main(String args[]){
        System.out.println("===SPLITWISE CONSOLE===");
        System.out.println("Track shared expenses with Friends");
        System.out.println("Ready.More features coming in the next lesson.");
        String payerName="Riya";
        double totalAmount=500.00;
        int numFriends=3;
        double perPersonShare=totalAmount/numFriends;
        String expenseLine=payerName +" paid Rs "+ totalAmount;
        String shareLine="Each person pays : "+perPersonShare;
        System.out.println(expenseLine);
        System.out.println(shareLine);
    }
}
