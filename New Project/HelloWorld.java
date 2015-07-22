public class HelloWorld{

     public static void printPay(double basePay, double hoursWorked){
         double totalPay;
         
         System.out.println("Minimum Wage is $"+ basePay + ",");
         System.out.println("Hours Worked are " + hoursWorked + "hrs:");
         
         if (basePay < 8) {
             System.out.println("The Minimum Wage is Too Low.");
         } else if (basePay < 0 || hoursWorked < 0) {
             System.out.println("Not Possible");
         } else {
             if (hoursWorked <= 40){
                 totalPay = hoursWorked * basePay;
             } else if (hoursWorked > 60) {
                 System.out.println("You're being Overworked");
                 totalPay = 40 * basePay + 20 * basePay * 1.5;
             } else {
                 totalPay = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
             }
             System.out.println("Your Total Pay is " + totalPay);
         }
     }   if (hoursWorked < 60){
             hoursWorked = 60;
     
     public static void main(String []args){
         
         printPay(8, 50);
     }
}
