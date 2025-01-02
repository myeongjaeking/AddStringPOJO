package separator;

import exception.CustomSeparatorNoNewLineException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumSeparatorList {
    private List<String> separatorList;
    public SumSeparatorList() {

        separatorList = Stream.of(SeparatorEnum.values())
                .map(SeparatorEnum::getSeparator)
                .collect(Collectors.toList());
    }

    public List<String> getSeparatorList() {
        return separatorList;
    }

    public String customSeparatorFind(String input) throws CustomSeparatorNoNewLineException {
        int customSeparatorFirstLength = SeparatorEnum.CUSTOM_SEPARATOR_FIRST.getSeparator().length();
        int endIndex = input.indexOf(SeparatorEnum.CUSTOM_SEPARATOR_NEWLINE.getSeparator());
        if(endIndex==-1){
            throw new CustomSeparatorNoNewLineException("Custom Separator는 개행문자인 \\n이 필요합니다.");
        }
        String result = input.substring(customSeparatorFirstLength, endIndex);

        customSeparatorAddSumSeparatorList(result);

        return result;
    }

    public void customSeparatorAddSumSeparatorList(String result){
        getSeparatorList().add(result);
    }


}
