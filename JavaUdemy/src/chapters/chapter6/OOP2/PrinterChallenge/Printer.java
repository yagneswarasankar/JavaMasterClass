package chapters.chapter6.OOP2.PrinterChallenge;

public class Printer {
    private int tonerLevel  ;
    private int pagesPrinted ;
    private boolean duplex  ;


    public Printer( int tonerLevel,boolean duplex) {

        //this.tonerLevel = (tonerLevel >-1 && tonerLevel <= 100) ? tonerLevel: -1;
        if(tonerLevel >-1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if(tonerAmount+ this.tonerLevel > 100){
                return -1;
            }else{
                return tonerLevel + tonerAmount;
            }
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if(this.duplex){
          pagesToPrint = (pages /2) + (pages %2)  ;
            System.out.println("Printing in duplex mode");
        }
         this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted(){
        return this.pagesPrinted;
    }

}
