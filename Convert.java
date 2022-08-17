public class Convert {
    public String[] ROMNUM = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
    public int num1,num2;

    public Convert(String levo, String pravo){  // перевод строк в арабские цифры
        if(!Character.isDigit(levo.charAt(0)) && !Character.isDigit(pravo.charAt(0))) { // если в строке введено не арабское число, то мы сравниваем с римскими числами из массива
            try {
                for (int i = 0; i < 11; i++) {

                    if (levo.equals(ROMNUM[i])) num1 = i;
                    if (pravo.equals(ROMNUM[i])) num2 = i;
                }
                num1 = num1 / num1 * num1;
                num2 = num2 / num2 * num2;

            }catch(ArithmeticException e) {
                System.out.println("Введено неверное значение.");
            }


        }else if (Character.isDigit(levo.charAt(0)) && Character.isDigit(pravo.charAt(0))) {//если введено арабское число то переводим из строки в число
            num1 = Integer.parseInt(levo);
            num2 = Integer.parseInt(pravo);
        }
        try {
            if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) {
                num1 = 0;
                num2 = 0;
            }
            num1 = num1 / num1 * num1;
            num2 = num2 / num2 * num2;
        } catch (ArithmeticException e) {
            System.out.println("Введено неверное значение.");
        }
    }
    public String convertToRom(int result){
        return result >=1 ? ROMNUM[result]: "Ошибка, число не может быть меньше или равно нулю";
    }

}