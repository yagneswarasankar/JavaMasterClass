package chapters.chapter11.packages.Scope;

public class ScopeCheck {

    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("The scopeCheck created . publicVar is : "+publicVar +" privateVar is: "+ privateVar);
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo(){
       int privateVar = 2;
        for(int i = 0; i< 10;i++){
            System.out.println(i + " times two is " + i * privateVar);
        }
    }

    public class InnerScopeCheck{
        public int publicVar = 3;
        private int privateVar = 3;

        public InnerScopeCheck() {
            System.out.println("The Inner Scope check created . publicVar is : "+publicVar +" privateVar is: "+ privateVar);
        }

        public void timesTwo(){
            //int privateVar = 3;
            for(int i = 0; i< 10;i++){
                System.out.println(i + " times two is " + i * this.privateVar);
            }
        }

    }


}
