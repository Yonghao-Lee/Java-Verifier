package ex5.scope;

import java.util.HashMap;

public class Scope {
    private final HashMap<String, Variable> variables = new HashMap<>();

    public Variable getVariable(String name){
        return variables.get(name);
    }

    public void addVariable(Variable variable){
        variables.put(variable.getName(), variable);
    }

    public boolean contains(String name){
        return variables.containsKey(name);
    }
}
