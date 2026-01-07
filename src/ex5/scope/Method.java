package ex5.scope;

import java.util.List;

/**
 * A POJO that represents a sjava method
 */
public class Method {
    private final String name;
    private final Type returnType;
    private final List<Variable> parameters;

    public Method(String name, Type returnType, List<Variable> parameters) {
        this.name = name;
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public Type getReturnType() {
        return returnType;
    }

    public List<Variable> getParameters() {
        return parameters;
    }
}
