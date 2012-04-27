public class ZELLE {
    public boolean istMauer;
    public boolean istKruemel;
    private int posX;
    private int posY;
    public ZELLENSYMBOL darstellung;
    private KRUEMEL inhalt;

    /**
     * Constructor for objects of class ZELLE
     */
    public ZELLE(int posX_Neu, int posY_Neu)
    {
        posX = posX_Neu;
        posY = posY_Neu;
        darstellung = new ZELLENSYMBOL(posX, posY);
        inhalt = new KRUEMEL(posX, posY);
    }

    public void mauerSetzen() {
        istMauer = true;
        darstellung.FuellFarbeSetzen("blau");
        darstellung.FuellungSichtbarSetzen(true);
        loescheKruemel();
    }
    
    public boolean hatMauer() {
        return istMauer;
    }
    
    public void RandFarbe() {
        darstellung.RandFarbeSetzen("gelb");
    }
    
    public void loescheKruemel() {
        inhalt.loescheKruemel();
    }
    
    public boolean hatKruemel() {
        if (hatMauer() == false) {
            istKruemel = true;   
        }
        return istKruemel;
    }
    
    public void powerKruemel() {
        inhalt.powBall();
    }
    
     boolean hatPower(){
        return inhalt.hatPower();
    }
}