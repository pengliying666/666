package sample;

public class ArithSamble {
    
    public int addNew(int num1,int num2) {
        return num1+num2;
    }
    
    public int sub(int num1,int num2) {
        return num1-num2;
    }
    
    public int taxIn(int price) {
        double taxRate=0.1;
        int postTax=(int)(price*(taxRate+1));
        return postTax;
    }
    

}
