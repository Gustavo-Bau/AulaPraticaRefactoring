public abstract class Price {
   public abstract int getPriceCode();
   public abstract double getCharge(int daysRented);

   // moved from Movie.getFrequentRenterPoints(int)
   public int getFrequentRenterPoints(int daysRented) {
       if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) return 2;
       return 1;
   }
}
