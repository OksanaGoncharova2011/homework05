//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//задача 1
    for (int i = 0; i <= 10; i = i + 1) {
        System.out.println(i);
    }
    //задача 2
    for (int i = 10; i > 0; i--) {
        System.out.println(i);
    }
    //задача 3 вывести четные
    for (int i = 0; i <= 17; i = i +2) {
        System.out.println(i);
    }
    //задача 4
    for (int i = 10; i > -10; i--) {
        System.out.println(i);
    }
    //задача 5
    for (int i = 1904; i < 2096; i = i + 4){
        System.out.println("Високосный год " + i);
    }
    //задача 6
    for (int i = 7; i <= 98; i = i +7) {
        System.out.println(i);
    }
    //задача 7
    for (int i = 2; i <= 512; i = i *2) {

    System.out.println(i);
    }
    //задача 8
    int salary = 29000;
    int total = 0;
    for (int i = 1; i <= 12; i++) {

        total = total + salary;
        System.out.println("Месяц " + i + " Итого " + total);
    }
    System.out.println(total);

//задача 9

    for (int i = 1; i <= 12; i++) {
        total = total + total/100;
        total = total + salary;
        System.out.println("Месяц " + i + " Итого " + total);
    }
    System.out.println(total);

    //задача 10


}



