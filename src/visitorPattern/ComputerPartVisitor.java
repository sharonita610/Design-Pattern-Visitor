package visitorPattern;



public abstract class ComputerPartVisitor {

    abstract void visit(Computer computer);
    abstract void visit(MemoryCard memoryCard);
    abstract void visit(Mouse mouse);
    abstract void visit(Keyboard keyboard);
    abstract void visit(Monitor monitor);

    // 하나 더 추가해보기
    abstract void visit(GraphicCard graphicCard);
}
