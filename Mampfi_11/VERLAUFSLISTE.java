
public class VERLAUFSLISTE
{

    private String[] namen;
    private int[] punkte;
    PUNKTELISTEANZEIGE anzeige;

    public VERLAUFSLISTE()
    {
        namen = new String[10];
        punkte = new int[10];
        for (int i=0; i < 10; i++) {
            namen[i] = "xxx";
            punkte[i] = 0;
        }
        anzeige = new PUNKTELISTEANZEIGE();
        anzeige.Aktualisieren(namen, punkte);
    }

    public void neuenSpielerEinfuegen(String nameNeu, int punkteNeu)
    {
        for (int i = 9; i >0; i--) {
            namen[i] = namen[i-1];
            punkte[i] = punkte[i-1];
        }
        namen[0] = nameNeu;
        punkte[0] = punkteNeu;
        anzeige.Aktualisieren(namen, punkte);
    }
}