public abstract class Price {
  public abstract int getPriceCode();

  public abstract double getCharge(int daysRented);

  public int getFrequentRenterPoints(int daysRented) {
    switch (getPriceCode()) {
      case Movie.NEW_RELEASE:
        return 2;
      default :
        return 1;
    }
  }
}