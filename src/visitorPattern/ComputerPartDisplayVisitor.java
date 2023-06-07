package visitorPattern;

public class ComputerPartDisplayVisitor extends ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying : Computer");
    }

    @Override
    public void visit(MemoryCard memoryCard) {
        System.out.println("Displaying : MemoryCard");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying : Mouse");

    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying : Keyboard");

    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying : Monitor");

    }

    @Override
    void visit(GraphicCard graphicCard) {
        System.out.println("Displaying : GraphicCard");
    }
}
