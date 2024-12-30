public class Colon implements Separator{
    private String colon = ":";

    private String colonChangePlus;


    public Colon(String str){
        this.colonChangePlus = separatorChangePlusString(str);
    }
    //":"을 "plus"로 치환 후 반환
    @Override
    public String separatorChangePlusString(String totalString){
        colonChangePlus=totalString.replace(colon,"plus");
        return colonChangePlus;
    }
    public String getColonChangePlus(){
        return colonChangePlus;
    }

}
