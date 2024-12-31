
public class CustomSeparator implements Separator{
    private String customSeparators="";

    private String customChangePlus;
    private String[] startEndString;
    private int i;

    //커스텀 구분자 추출
    private void customSeparatorExtract(String totalString){

        newlineCustom(totalString);

        for(i=2; i<startEndString[0].length();i++){ //true일 때 "//" index는 0,1이기 떄문에 2부터 시작
            startEndString[0].charAt(i);
            customSeparators += startEndString[0].charAt(i);
        }

        this.customSeparators=customSeparators;
    }
    //문자열에서 \\n을 \n으로 치환 후 나누어 문자열 배열에 저장
    private void newlineCustom(String totalString){
        totalString = totalString.replace("\\n","\n");
        this.startEndString = totalString.split("\n");
    }
    //문자열 시작이 "//"인지 참,거짓 반환
    public boolean isStartSeparator(String totalString){
        return totalString.startsWith("//");
    }


    public CustomSeparator(String totalString){
        this.i=0;
        this.customChangePlus = separatorChangePlusString(totalString);

    }
    @Override
    public String separatorChangePlusString(String totalString){

        if(isStartSeparator(totalString)) {
            customSeparatorExtract(totalString);
            totalString = startEndString[1];
            customChangePlus=totalString.replace(customSeparators,"plus");

        }
        else {
            customChangePlus = totalString;

        }
        return customChangePlus;
    }

    public String getCustomChangePlus(){
        return customChangePlus;
    }


}
