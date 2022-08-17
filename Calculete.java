public class Calculete {
    public int result;
    public Calculete (char znak,int num1 ,int num2){
        if (znak=='+'){
            result=num1+num2;}
        else if (znak=='-'){
            result=num1-num2;}
        else if (znak=='*'){
            result=num1*num2;}
        else if (znak=='/'){
            result=num1/num2;}
    }


}
