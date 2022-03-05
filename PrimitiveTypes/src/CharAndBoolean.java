public class CharAndBoolean {
    public static void main(String[] args){

        //The characters datatypes are basically good to use in certain use cases
        //to know the last character used by user in a menu driven programs
        //to know the last character used by the user in a game etc.
        //It occupies 2 bytes of data.
        //Why we need 2 bytes of data to store single character. Because it stores the Unicode values to facilitate
        //java or to the matter of fact any programming language to use the 63K odd unicode characters.
        //Unicode characters for various characters can be found here: https://unicode-table.com/en/
        //based on the column and row numbers in the list.


        char charValue = 'D';
        char uniCodeValueForD = '\u0044';
        char uniCodeValueforPi = '\u00F8';

        System.out.println("Print the character charValue(D) :" + charValue);
        System.out.println("Print the character uniCodeValueForD(0040): " + uniCodeValueForD);
        System.out.println("Print the character uniCodeValue for ø : " + uniCodeValueforPi);

    }
}
