package separator;

public enum SeparatorEnum {
    CUSTOM_SEPARATOR_FIRST("//"),
    CUSTOM_SEPARATOR_NEWLINE("\\n"),
    COLON_SEPARATOR(":"),
    REST_SEPARATOR(",");

    private final String separator;

    SeparatorEnum(String s) {
        this.separator = s;
    }

    public String getSeparator() {
        return separator;
    }

}
