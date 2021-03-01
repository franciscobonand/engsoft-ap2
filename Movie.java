public class Movie {

  public static final int  CHILDRENS = 2;
  public static final int  REGULAR = 0;
  public static final int  NEW_RELEASE = 1;

  private String _title;
  private Price _price;

  public Movie(String name, int priceCode) {
    _title = name;
    setPriceCode(priceCode);
  }
  
  public int getPriceCode() {
    return _price.getPriceCode();
  }
  
  public void setPriceCode(int arg) {
    switch (arg) {
        case REGULAR:
          _price = new RegularPrice();
          break;
        case CHILDRENS:
          _price = new ChildrensPrice();
          break;
        case NEW_RELEASE:
          _price = new NewReleasePrice();
          break;
        default:
          throw new IllegalArgumentException("Incorrect Price Code");
    }
  }

  public String getTitle (){
      return _title;
  }

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

  public int getFrequentRenterPoints(int daysRented) {
    switch (getPriceCode()) {
      case Movie.NEW_RELEASE:
        return 2;
      default :
        return 1;
    }
  }
}