import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String test = "1,2,3:4";
//        Colon colon = new Colon(test);
//        Rest rest = new Rest(colon.getColonNotString());
//        System.out.println("Rest Sum :"+rest.getSum());
//        System.out.println("Colon Sum :"+colon.getSum());
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.next();
            Colon colon1 = new Colon(str);
            Rest rest1 = new Rest(colon1.getColonChangePlus());
            SumPlus sumPlus = new SumPlus(rest1.getRestChangePlus());
            System.out.println(sumPlus.getSum());

        }
    }
}