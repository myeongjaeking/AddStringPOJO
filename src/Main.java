import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.next();
            CustomSeparator customSeparator1 = new CustomSeparator(str);
            str = customSeparator1.getCustomChangePlus();
            System.out.println(customSeparator1.getCustomChangePlus());
            Colon colon1 = new Colon(str);
            str = colon1.getColonChangePlus();
            Rest rest1 = new Rest(str);
            str = rest1.getRestChangePlus();
            SumPlus sumPlus = new SumPlus(str);
            System.out.println(sumPlus.getSum());

        }

    }
}