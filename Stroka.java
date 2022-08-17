public class Stroka {
    public char znak;
    public int nomerznaka;
    public  String levo;
    public String pravo;
    public Stroka(String text){ // получаем строку из класса kalr
        if (text.indexOf('+')>0){  //ищем знак в строке
            nomerznaka= text.indexOf('+'); //находим порядковый номер знака в строке
            znak='+';}
        else if (text.indexOf('-')>0){
            nomerznaka=text.indexOf('-');
            znak='-';}
        else if (text.indexOf('/')>0){
            nomerznaka=text.indexOf('/');
            znak='/';}
        else if (text.indexOf('*')>0){
            nomerznaka=text.indexOf('*');
            znak='*';}
        else System.out.println("Неверная запись выражения");
        levo=text.substring(0,nomerznaka);
        pravo=text.substring(nomerznaka+1,text.length());


    }
}
