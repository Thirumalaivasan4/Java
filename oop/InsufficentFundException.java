package oop;

public class InsufficentFundException extends Exception {
double amount;
InsufficentFundException(double amou){
amount=amou;
}
}
