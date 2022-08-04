package sda.arpjavapl5.solid.lsp;

public class RectangleAndSquareDemo {
    public static void main(String[] args) {
        Rectangle square = new BorderedRectangle(4, 4, 5);
        square.setHeight(7);
        square.setWidth(4);
        if (square.getWidth() == 4 && square.getHeight()==7){
            System.out.println("Poprawny substytut.");
        } else {
            System.out.println("Niepoprawny substytut!");
        }

    }
}
