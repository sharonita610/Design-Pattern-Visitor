package visitorPattern;

public class Computer implements ComputerPart {
    ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[]{
                new Mouse(), new MemoryCard(), new Keyboard(), new Monitor(), new GraphicCard()
        };
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {

        for (int i = 0; i < computerParts.length; i++) {
            computerParts[i].accept(computerPartVisitor);
        }

        computerPartVisitor.visit(this);

    }
}
