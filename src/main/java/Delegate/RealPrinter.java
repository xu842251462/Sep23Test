package Delegate;

public class RealPrinter {
    void print(){
        System.out.println("the delegate");
    }


}

/*class Printer{

    RealPrinter r = new RealPrinter();
    void print(){
        r.print();
    }


    public static void main(String[] args) {

        Printer p = new Printer();
        p.print();
    }
}*/

class Printer extends RealPrinter{

    void print(){
        super.print();
    }

    public static void main(String[] args) {
        RealPrinter p = new Printer();
        p.print();
    }
}


