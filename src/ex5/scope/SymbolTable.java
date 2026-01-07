package ex5.scope;

import java.util.ArrayList;

public class SymbolTable {
    private final ArrayList<Scope> scopes = new ArrayList<>();

    public void newScope(){
        scopes.add(new Scope());
    }

    public void endScope(){
        scopes.removeLast();
    }

    private Variable getVariable(String name){
        for (Scope scope : scopes.reversed()){
            if (scope.contains(name)){
                return scope.getVariable(name);
            }
        }

        return null;
    }

    public void declareVariable(String name, Type type, boolean isInitialized, boolean isFinal){
        scopes.getLast().addVariable(new Variable(name, type, isInitialized, isFinal));
    }

    public void assignVariable(String name){
        scopes.getLast().getVariable(name).setInitialized(true);
    }

    public Type getType(String name){
        Variable variable = getVariable(name);
        if (variable == null){
            throw new VariableNotFoundException(name);
        }
        return variable.getType();
    }

    public boolean isInitialized(String name){
        Variable variable = getVariable(name);
        if (variable == null){
            throw new VariableNotFoundException(name);
        }
        return variable.isInitialized();
    }

    public boolean isFinal(String name){
        Variable variable = getVariable(name);
        if (variable == null){
            throw new VariableNotFoundException(name);
        }
        return variable.isFinal();
    }
}
