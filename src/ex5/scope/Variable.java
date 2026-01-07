package ex5.scope;

/**
 * A POJO to represent a sjava variable
 */
public class Variable {
    private final String name;
    private final Type type;
    private boolean isInitialized;
    private final boolean isFinal;

    public Variable(String name, Type type, boolean isInitialized, boolean isFinal) {
        this.name = name;
        this.type = type;
        this.isInitialized = isInitialized;
        this.isFinal = isFinal;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setInitialized(boolean initialized) {
        isInitialized = initialized;
    }
}
