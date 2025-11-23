public abstract class Price {
   public abstract int getPriceCode();
   public abstract double getCharge(int daysRented);

   // default implementation: generic frequent renter points
   public int getFrequentRenterPoints(int daysRented) {
       return 1;
   }
}
