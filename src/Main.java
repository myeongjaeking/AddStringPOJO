//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String totalString = "//acd\n1acd2acd3acd";
        CustomSeparator customSeparator = new CustomSeparator(totalString);

        SumPlus sumPlus = new SumPlus(customSeparator.getCustomChangePlus());
        System.out.println(sumPlus.getSum());
    }
}