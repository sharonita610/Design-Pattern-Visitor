import visitorPattern.Computer;
import visitorPattern.ComputerPart;
import visitorPattern.ComputerPartDisplayVisitor;

public class Main {
    public static void main(String[] args) {


        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}