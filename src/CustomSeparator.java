
public class CustomSeparator implements Separator{
    private String customSeparators="";

    private String customChangePlus;
    private int i;

    //커스텀 구분자 추출
    private String customSeparatorExtract(String totalString){
        if(isStartSeparator(totalString)){
            for(i=2; i<totalString.length();i++){ //true일 때 "//" index는 0,1이기 떄문에 2부터 시작

                if(!isEndSeparator(totalString,i)) customSeparators +=totalString.charAt(i);
                else break;
            }
        }

        return customSeparators;
    }

    //문자열 시작이 "//"인지 참,거짓 반환
    public boolean isStartSeparator(String totalString){
        return totalString.startsWith("//");
    }

    //해당 index에서 '\n'인지 참,거짓 반환
    public boolean isEndSeparator(String totalString, int i){

        return totalString.charAt(i)=='\\' && totalString.charAt(i+1)=='n';
    }


    public CustomSeparator(String totalString){
        this.i=0;

        this.customChangePlus = separatorChangePlusString(totalString);

    }
    @Override
    public String separatorChangePlusString(String totalString){

        if(isStartSeparator(totalString)) {
            customSeparatorExtract(totalString);
            totalString = deleteSeparator(totalString, i);
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

    //커스텀구분자 제거 ex) "//acd\n1acd2acd3acd" -> 1acd2acd3acd
    public String deleteSeparator(String totalString,int i){
        totalString = totalString.substring(i+2,totalString.length());
        return totalString;
    }

}
