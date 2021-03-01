public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }

   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }

  public double getCharge() {
    double thisAmountTemp = 0;
    //determine amounts for each line
    switch (getMovie().getPriceCode()) {
      case Movie.REGULAR:
        thisAmountTemp += 2;
        if (getDaysRented() > 2)
            thisAmountTemp += (getDaysRented() - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        thisAmountTemp += getDaysRented() * 3;
        break;
      case Movie.CHILDRENS:
        thisAmountTemp += 1.5;
        if (getDaysRented() > 3)
            thisAmountTemp += (getDaysRented() - 3) * 1.5;
          break;
    }
    return thisAmountTemp;
  }
}