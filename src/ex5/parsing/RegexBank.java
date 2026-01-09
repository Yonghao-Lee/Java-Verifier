package ex5.parsing;

import java.util.regex.Pattern;

public class RegexBank {
    public static final Pattern VARIABLE_DECLARATION_LINE = Pattern.compile(
            "^\\s*((?:final )?)\\s*(int|double|String|boolean|char)\\s+" +
                    "((?:\\w+(?:\\s*=\\s*\\w+)?\\s*,\\s*)*\\w+(?:\\s*=\\s*\\w+)?\\s*);\\s*$");

    public static final Pattern METHOD_DECLARATION_LINE = Pattern.compile(
            "^\\s*void\\s+method\\s+(\\w+)\\s*\\" +
                    "(((?:\\s*(?:int|double|String|boolean|char)\\s+\\w+\\s*,)*\\s*" +
                    "(?:int|double|String|boolean|char)\\s+\\w+\\s*)\\)\\s*\\{\\s*$");

    public static final Pattern METHOD_CALL_LINE = Pattern.compile(
            "^\\s*([\\w]+)\\s*\\(((?:(?:\\s*[\\w]+\\s*,)*\\s*[\\w]+\\s*)?)\\)\\s*;\\s*$");

    public static final Pattern RETURN_LINE = Pattern.compile("^\\s*return\\s*;\\s*$");

    public static final Pattern IF_LINE = Pattern.compile("^\\s*if\\s*\\((.+)\\)\\s*\\{\\s*$");

    public static final Pattern WHILE_LINE = Pattern.compile("^\\s*while\\s*\\((.+)\\)\\s*\\{\\s*$");

    public static final Pattern COMPOSITE_CONDITION = Pattern.compile(
            "^\\s*((\\w+|(-?\\d+(\\.\\d+)?))\\s*(?:\\|\\||&&)\\s*)*" +
                    "(\\w+|(-?\\d+(\\.\\d+)?))\\s*$");
}
