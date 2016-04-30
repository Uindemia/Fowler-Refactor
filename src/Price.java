/**
 * Created by Marc on 30.04.2016.
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double amountFor(int daysRented);
}

class ChildrensPrice extends Price {
    double amountFor(int daysRented){
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented
                    -
                    3) * 1.5;
        return result;
    }
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}
class NewReleasePrice extends Price {
    double amountFor(int daysRented){
        return daysRented * 3;
    }
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
class RegularPrice extends Price {
    double amountFor(int daysRented){
        double result = 2;
        if (daysRented > 2)
            result += (daysRented
                    -
                    2) * 1.5;
        return result;
    }
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
