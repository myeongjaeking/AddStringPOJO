public class SumPlus {
    private int sum;
    private String separator = "plus";
    private String[] changeArraySting;
    //"plus" 기준으로 문자열 나누어서 배열에 저장
    public String[] plustSeparator (String plusString){
        changeArraySting = plusString.split(separator);
        return changeArraySting;
    }
    //문자열을 Integer로 치환 후 덧셈
    public int sumPlusArrayString (String[] pluses){
        for(String plus : pluses){
            try {
                sum+=Integer.parseInt(plus);
            }catch (IllegalAccessError e){
                System.out.println("적절한 구분자가 아닙니다.");
            }
        }
        return sum;
    }
    public SumPlus(String plus){
        this.changeArraySting = plustSeparator(plus);
        this.sum = sumPlusArrayString(changeArraySting);
    }
    public int getSum(){
        return sum;
    }

}


