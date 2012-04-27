public class LABYRINTH {
    private ZELLE[][] spielfeld;

    /**
     * Constructor for objects of class LABYRINTH
     */
    public LABYRINTH()
    {
        spielfeld = new ZELLE[10][10];
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                ZELLE zelle = new ZELLE(x,y);
                spielfeld[x][y] = zelle;
            }
        }
        erstelleLabyrinth();
        durchgangMarkieren();
        powerKruemel();
    }

    public void mauerSetzen(int x, int y) {
        spielfeld[x][y].mauerSetzen();
    }
    
    public boolean hatMauer(int x, int y) {
        return spielfeld[x][y].hatMauer();
    }
    
    public void erstelleLabyrinth() {
        //spielfeld[0][2].mauerSetzen();
        spielfeld[1][4].mauerSetzen();
        spielfeld[1][5].mauerSetzen();
        spielfeld[6][8].mauerSetzen();
        spielfeld[5][8].mauerSetzen();
        spielfeld[1][0].mauerSetzen();
        spielfeld[0][8].mauerSetzen();
        spielfeld[5][2].mauerSetzen();
        spielfeld[5][1].mauerSetzen();
        spielfeld[5][0].mauerSetzen();
        spielfeld[6][0].mauerSetzen();
        spielfeld[7][0].mauerSetzen();
        spielfeld[5][4].mauerSetzen();
        spielfeld[2][8].mauerSetzen();
        spielfeld[3][8].mauerSetzen();
        spielfeld[8][9].mauerSetzen();
        spielfeld[3][6].mauerSetzen();
        spielfeld[4][6].mauerSetzen();
        spielfeld[7][4].mauerSetzen();
        spielfeld[9][7].mauerSetzen();
        spielfeld[0][7].mauerSetzen();
        spielfeld[1][2].mauerSetzen();
        spielfeld[2][2].mauerSetzen();
        spielfeld[3][2].mauerSetzen();
        spielfeld[3][1].mauerSetzen();
        spielfeld[3][4].mauerSetzen();
        spielfeld[7][2].mauerSetzen();
        spielfeld[9][0].mauerSetzen();
        spielfeld[9][1].mauerSetzen();
        spielfeld[9][2].mauerSetzen();
        spielfeld[8][7].mauerSetzen();
        spielfeld[6][7].mauerSetzen();
        spielfeld[6][6].mauerSetzen();
        spielfeld[5][5].mauerSetzen();
        spielfeld[8][4].mauerSetzen();
        spielfeld[8][5].mauerSetzen();
        spielfeld[5][6].mauerSetzen();
    }
    
    public void durchgangMarkieren() {
        spielfeld[4][0].RandFarbe();
        spielfeld[4][9].RandFarbe();
        spielfeld[0][3].RandFarbe();
        spielfeld[9][3].RandFarbe();
    }
    
    public void Geistmauer() {
        spielfeld[1][0].istMauer = false;
        spielfeld[5][0].istMauer = false;
        spielfeld[6][0].istMauer = false;
        spielfeld[7][0].istMauer = false;
        spielfeld[6][7].istMauer = false;
        spielfeld[8][9].istMauer = false;
        spielfeld[9][7].istMauer = false;
        spielfeld[1][0].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[5][0].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[6][0].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[7][0].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[6][7].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[8][9].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[9][7].darstellung.FuellFarbeSetzen("weiss");
        spielfeld[1][0].darstellung.FuellungSichtbarSetzen(true);
        spielfeld[5][0].darstellung.FuellungSichtbarSetzen(true);
        spielfeld[6][0].darstellung.FuellungSichtbarSetzen(true);
        spielfeld[7][0].darstellung.FuellungSichtbarSetzen(true);
        spielfeld[6][7].darstellung.FuellungSichtbarSetzen(true);
        spielfeld[8][9].darstellung.FuellungSichtbarSetzen(true);
        spielfeld[9][7].darstellung.FuellungSichtbarSetzen(true);
    }
    
    public boolean hatKruemel(int x, int y) {
        return spielfeld[x][y].hatKruemel();
    }
    
    public void loescheKruemel(int x, int y) {
        spielfeld[x][y].loescheKruemel();
    }
    
    public void powerKruemel() {
        spielfeld[0][0].powerKruemel();
        spielfeld[8][0].powerKruemel();
        spielfeld[9][9].powerKruemel();
        spielfeld[5][7].powerKruemel();
    }  

    boolean hatPowerball(int x, int y){
        return spielfeld[x][y].hatPower();
    }
}
