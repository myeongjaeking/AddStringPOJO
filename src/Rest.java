
public class Rest implements Separator{
    private String rest = ",";

    private String restChangePlus;

    public Rest(String totalString){
        this.restChangePlus =separatorChangePlusString(totalString);
    }
    //","을 "plus"로 치환 후 반환
    @Override
    public String separatorChangePlusString(String totalString){
        restChangePlus=totalString.replace(rest,"plus");
        return restChangePlus;
    }
    public String getRestChangePlus(){
        return restChangePlus;
    }


}
