import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner consol=new Scanner(System.in); // создание сканера
        String text=consol.nextLine(); // считываем данные с консоли в строку
        Stroka stroka =new Stroka(text); //создаем объект  класса и отправляем в него строку
        String levo= stroka.levo;//вытаскиваем значение из класса Stroka
        String pravo=stroka.pravo;//вытаскиваем значение из класса Stroka
        char znak=stroka.znak; //достаем знак из класса строка и присваеваем
        Convert convert=new Convert(levo,pravo); // реализация конвертации римских чисел для счета
        int num1=convert.num1;
        int num2=convert.num2;
        Calculete calculete=new Calculete(znak, num1, num2); // создание обьекта класса калькулятор и передаем знак, И ПЕРЕДАЕМ ДВА ЧИСЛА

        if (!Character.isDigit(stroka.levo.charAt(0))&&!Character.isDigit(stroka.pravo.charAt(0))&& calculete.result>0){
            System.out.println(convert.convertToRom(calculete.result));}
        else if (!Character.isDigit(stroka.levo.charAt(0))&&!Character.isDigit(stroka.pravo.charAt(0))&& calculete.result<=0){
            System.out.println("Ошибка");}
        else if (Character.isDigit(stroka.levo.charAt(0))&&Character.isDigit(stroka.pravo.charAt(0))&&convert.num1>0&&convert.num1<11&&convert.num2>0&&convert.num2<11 ){
            System.out.println(calculete.result);
        }


    }
}
