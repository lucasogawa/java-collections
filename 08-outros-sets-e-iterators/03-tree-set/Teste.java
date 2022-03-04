import java.util.TreeSet;

public class Teste {
    public static void main(String[] args) {
        Recibo recibo1 = new Recibo();
        Recibo recibo2 = new Recibo();
        Recibo recibo3 = new Recibo();
        TreeSet<Recibo> recibos = new TreeSet<>();

        recibos.add(recibo1);
        recibos.add(recibo2);
        recibos.add(recibo3);
    }
}
