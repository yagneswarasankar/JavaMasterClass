package chapters.chapter11.packages.Scope;

public class Main {

    public static void main(String[] args) {

        ScopeCheck scopeCheck = new ScopeCheck();
        System.out.println(scopeCheck.getPrivateVar());
        scopeCheck.timesTwo();

        System.out.println("***********************************************");


        ScopeCheck.InnerScopeCheck innerScopeCheck = scopeCheck.new InnerScopeCheck();
        innerScopeCheck.timesTwo();



    }
}
