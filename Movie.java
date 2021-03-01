public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private int _priceCode;

  public Movie(String title, int priceCode) {
      _title = title;
      _priceCode = priceCode;
  }

  public int getPriceCode() {
      return _priceCode;
  }

  public void setPriceCode(int arg) {
      _priceCode = arg;
  }

  public String getTitle (){
      return _title;
  }

  public double getCharge(int daysRented) {
    double thisAmountTemp = 0;
    //determine amounts for each line
    switch (_priceCode) {
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

  public int getFrequentRenterPoints(int daysRented) {
    switch (_priceCode) {
      case Movie.NEW_RELEASE:
        return 2;
      default :
        return 1;
    }
  }
}