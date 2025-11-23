import java.util.Enumeration;

public class TextStatement extends Statement {

   protected String header(Customer aCustomer) {
      return "Rental Record for " + aCustomer.getName() + "\n";
   }

   protected String lineItem(Rental aRental) {
      return "\t" + aRental.getMovie().getTitle() + "\t" +
             String.valueOf(aRental.getCharge()) + "\n";
   }

   protected String footer(Customer aCustomer) {
      String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
      return result;
   }
}
