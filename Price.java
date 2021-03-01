public abstract class Price {
  public abstract int getPriceCode();

  public double getCharge(int daysRented) {
    double thisAmountTemp = 0;
    //determine amounts for each line
    switch (getPriceCode()) {
      case Movie.REGULAR:
        thisAmountTemp += 2;
        if (daysRented > 2)
            thisAmountTemp += (daysRented - 2) * 1.5;
        break;
      case Movie.NEW_RELEASE:
        thisAmountTemp += daysRented * 3;
        break;
      case Movie.CHILDRENS:
        thisAmountTemp += 1.5;
        if (daysRented > 3)
            thisAmountTemp += (daysRented - 3) * 1.5;
          break;
    }
    return thisAmountTemp;
  }
}