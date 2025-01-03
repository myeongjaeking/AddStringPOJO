package separator;

import exception.CustomSeparatorEmptyException;
import exception.CustomSeparatorNoNewLineException;
import exception.CustomSeparatorNumberException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumSeparatorList {
    private List<String> separatorList;
    private FindCustomSeparator findCustomSeparator;

    public SumSeparatorList(FindCustomSeparator findCustomSeparator) {

        this.findCustomSeparator = findCustomSeparator;
        this.separatorList = Stream.of(SeparatorEnum.values())
                .map(SeparatorEnum::getSeparator)
                .collect(Collectors.toList());
    }

    public List<String> getSeparatorList() {
        return separatorList;
    }


    public void customSeparatorAddSumSeparatorList(String input) throws CustomSeparatorNumberException, CustomSeparatorNoNewLineException, CustomSeparatorEmptyException {
        String result = findCustomSeparator.findCustomSeparator(input);

        separatorList.add(result);
    }


}
