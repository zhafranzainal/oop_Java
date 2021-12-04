package chaletbookingsystem;

import java.util.Scanner;

public class ChaletBookingSystem{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int visitorType, visitorIdentity;
        
        LocalVisitor lv = new LocalVisitor("Abu", 1221, "0123456789", 2, "Gold");
        ForeignVisitor fv = new ForeignVisitor("John", 5677, new Booking(), 1, "Europe");
        
        System.out.print("Enter Visitor Type [1-Local, 2-International]   : ");
        visitorType=input.nextInt();
        
        if(visitorType==1){
        
            System.out.print("Enter visitor ID                                : ");
            visitorIdentity=input.nextInt();

            System.out.println("\nYou Need To Create New Booking!!");
            lv.setBooking(new Booking());
        
            System.out.print("\nEnter Booking Quantity                      : ");
            lv.getBooking().setBookingQuantity(input.nextInt());
        
            System.out.print("Enter Chalet Type [premier/deluxe/superior] : ");
            lv.getBooking().getChalet().setChaletType(input.next());
        
            if(visitorIdentity==lv.getVisitorID()){
                System.out.println("\nLOCAL VISITOR BILL INFORMATION");
                System.out.println("Visitor ID                              : " +lv.getVisitorID());
                System.out.println("Visitor Name                            : " +lv.getVisitorName());
                System.out.println("Visitor Contact No                      : " +lv.getVisitorContactNo());
                System.out.println("Visitor Coupon Type                     : " +lv.getCouponType());
                System.out.println("Visitor Total of Hours (Late Check Out) : " +lv.lateCheckOutHour);
                System.out.println("Visitor Booking Quantity                : " +lv.getBooking().getBookingQuantity());
                System.out.println("Visitor Chalet Type                     : " +lv.getBooking().getChalet().getChaletType());
                System.out.println("Total Payment                           : RM" +lv.totalPayment() +"0");}
            
            else{
                System.out.println("You have entered wrong visitor ID! Enter the next visitor.");}
        }
        
        System.out.print("\nEnter visitor ID: ");
        visitorIdentity=input.nextInt();
        
        if(visitorIdentity==fv.getVisitorID()){

            System.out.println("\nYou have already made the pre-online booking. Please proceed..");

            System.out.print("\nEnter Booking Quantity                      : ");
            fv.getBooking().setBookingQuantity(input.nextInt());

            System.out.print("Enter Chalet Type [premier/deluxe/superior] : ");
            fv.getBooking().getChalet().setChaletType(input.next());
        
            System.out.println("\nINTERNATIONAL VISITOR BILL INFORMATION");
            System.out.println("Visitor ID                              : " +fv.getVisitorID());
            System.out.println("Visitor Name                            : " +fv.getVisitorName());
            System.out.println("Visitor Contact No                      : " +fv.getVisitorContactNo());
            System.out.println("Visitor Visitor Origin                  : " +fv.getVisitorOrigin());
            System.out.println("Visitor Total of Hours (Late Check Out) : " +fv.lateCheckOutHour);
            System.out.println("Visitor Booking Quantity                : " +fv.getBooking().getBookingQuantity());
            System.out.println("Visitor Chalet Type                     : " +fv.getBooking().getChalet().getChaletType());
            System.out.println("Total Payment                           : RM" +fv.totalPayment() +"0\n");}
        
        else{
            System.out.println("You have entered wrong visitor ID! Enter the next visitor.");}
    } 
}
