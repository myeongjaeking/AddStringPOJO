package sum;

import java.util.List;

public class SeparatorSumCalculate {
    private String[] result;

    public void separatorSumCalculate(List<String> sumSeparatorList,String input){

        for(String separator:sumSeparatorList){
            input = input.replace(separator," ");

        }
        result = input.split(" ");

    }
    public int sumCalculate() {
        int sum = 0;
        for (String resultInteger : result) {
            if (!resultInteger.isEmpty()) {
                sum += Integer.parseInt(resultInteger);
            }
        }
        return sum;
    }


}
