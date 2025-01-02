import exception.CustomSeparatorEmptyException;
import exception.CustomSeparatorNoNewLineException;
import exception.CustomSeparatorNumberException;
import exception.InputStringBlacnkException;
import inputOutput.InputString;
import separator.SumSeparatorList;
import sum.SeparatorSumCalculate;
import verification.Verification;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CustomSeparatorNumberException, CustomSeparatorNoNewLineException, CustomSeparatorEmptyException, InputStringBlacnkException {


        InputString inputString = new InputString();

        SumSeparatorList sumSeparatorList = new SumSeparatorList();
        SeparatorSumCalculate separatorCalculate = new SeparatorSumCalculate();
        Verification verification = new Verification(sumSeparatorList);
        while (true){
            String input = inputString.getString();
            verification.verificationString(input);
            separatorCalculate.separatorSumCalculate(sumSeparatorList.getSeparatorList(),input);
            System.out.println(separatorCalculate.sumCalculate());

        }

    }
}