public abstract class Price {
   public abstract int getPriceCode();

   // moved from Movie.getCharge(int)
   public double getCharge(int daysRented) {
      double result = 0;
      switch (getPriceCode()) {
         case Movie.REGULAR:
            result += 2;
            if (daysRented > 2)
               result += (daysRented - 2) * 1.5;
            break;
         case Movie.NEW_RELEASE:
            result += daysRented * 3;
            break;
         case Movie.CHILDRENS:
            result += 1.5;
            if (daysRented > 3)
               result += (daysRented - 3) * 1.5;
            break;
         default:
            throw new IllegalArgumentException("Unknown price code");
      }
      return result;
   }
}
