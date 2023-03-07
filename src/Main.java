import Pens.Eraser;
import Pens.Highlighter;
import Pens.Pen;
import Pens.Pencil;
import Shapes.*;

public class Main {

    public static void main(String[] args)
    {
        Pen pen = new Pen();
        //shapes
        Circle circle = new Circle();
        Oval oval = new Oval();
        Phombus phombus = new Phombus();
        Quad quad = new Quad();
        Triangle triangle = new Triangle();

        //pens
        Eraser eraser = new Eraser();
        Highlighter highlighter = new Highlighter();
        Pencil pencil = new Pencil();

        //printers
        ShapePrinter shapePrinter = new ShapePrinter();
        PenPrinter penPrinter = new PenPrinter();

        //print name of shape
        shapePrinter.printNameOfShape(phombus);

        //print name of pen
        penPrinter.printNameOfPen(highlighter);

    }
}