package Ch_09.problem02;

// Created By: Reda Elsayed

//UML diagram
/********************************************
 *                    Stock                  *
 *-------------------------------------------*
 * symbol: String                            *
 * name: String                              *
 * previousClosingPrice: double              *
 * currentPrice: double                      *
 * Stock(symbol: String, mame: String) *
 * getChangePercent(): double                *
 ********************************************/
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        return (previousClosingPrice-currentPrice)/currentPrice*100;
    }
}
