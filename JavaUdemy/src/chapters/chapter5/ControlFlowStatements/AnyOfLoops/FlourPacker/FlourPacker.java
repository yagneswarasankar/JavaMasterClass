package chapters.chapter5.ControlFlowStatements.AnyOfLoops.FlourPacker;


//Beautiful explanation here
//https://www.udemy.com/course/java-the-complete-java-developer-course/learn/quiz/4448802#questions/9068850

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(((bigCount * 5) + (smallCount) < goal) || (bigCount <0 || smallCount < 0)) {
            return false;
        }
        int bigCountToUse = bigCount < goal/5 ? bigCount : goal/5 ; // #2 determine how many bigCount to use
        return (goal - bigCountToUse*5) <= smallCount; // #3 evaluate if enough smallCount to fill the rest of the order
    }
}
