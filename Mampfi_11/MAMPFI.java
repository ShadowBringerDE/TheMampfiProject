class MAMPFI
{
    // Attribute
    int posX;
    int posY;
    boolean verwundbar;
    char blickrichtung;
    MAMPFISYMBOL symbol;
    LABYRINTH spielfeld;

    MAMPFI(LABYRINTH spielfeldNeu) {
        spielfeld = spielfeldNeu;
        posX = 0;
        posY = 0;
        verwundbar = true;
        blickrichtung = 'O';
        symbol = new MAMPFISYMBOL();
        symbol.BogenArtSetzen(2);
        symbol.BogenWinkelSetzen(300);
        symbol.RadiusSetzen(27);
        symbol.StartWinkelSetzen(30);
        symbol.MundBewegtSichSetzen(true);
        symbol.RandFarbeSetzen("black");
    }

    private void schauNachNorden() {
        blickrichtung = 'N';
        symbol.StartWinkelSetzen(120);
    }

    private void schauNachSueden() {
        blickrichtung = 'S';
        symbol.StartWinkelSetzen(300);
    }

    private void schauNachOsten() {
        blickrichtung = 'O';
        symbol.StartWinkelSetzen(30);
    }

    private void schauNachWesten() {
        blickrichtung = 'W';
        symbol.StartWinkelSetzen(210);

    }

    void laufNachSueden() {
        schauNachSueden();
        //Geheimweg!
        if (posX == 4 && posY == 9) {
            posY = 0;
        //Pistenrand
        } else {
            if (posY < 10) {
                if (spielfeld.hatMauer(posX, posY+1) == false) {
                    posY = posY+1;
                }
            }
        }
        symbol.PositionYSetzen(posY);
        kruemelFressen();
    }

    void laufNachNorden() {
        schauNachNorden();
        if (posX == 4 && posY == 0) {
            posY = 9;
        } else {
            if (posY > 0) {
                if (spielfeld.hatMauer(posX, posY-1) == false) {
                    posY = posY-1;
                }
            }

        }
        symbol.PositionYSetzen(posY);
        kruemelFressen();
    }

    void laufNachOsten() {
        schauNachOsten();
        if (posX == 9 && posY == 3) {
            posX = 0;
        } else {
            if (posX < 10) {
                if (spielfeld.hatMauer(posX+1, posY) == false) {
                    posX = posX+1;
                }

            }
        }
        symbol.PositionXSetzen(posX);
        kruemelFressen();
    }

    void laufNachWesten() {
        schauNachWesten();
        if (posX == 0 && posY == 3) {
            posX = 9;
        } else {
            if (posX > 0) {
                if (spielfeld.hatMauer(posX-1, posY) == false) {
                    posX = posX-1;
                }

            }
        }
        symbol.PositionXSetzen(posX);
        kruemelFressen();
    }

    void verwundbarSetzen (boolean verwundbarNeu) {
        verwundbar = verwundbarNeu;
        if (verwundbar == true) {
            symbol.FuellFarbeSetzen("gelb");
            spielfeld.erstelleLabyrinth();
        } else {
            symbol.FuellFarbeSetzen("weiss");
            symbol.RandFarbeSetzen("blau");
            spielfeld.Geistmauer();
        }
    }

    void kruemelFressen() {
        if (spielfeld.hatKruemel(posX, posY) == true) {
            if (spielfeld.hatPowerball(posX, posY) == true) {
                spielfeld.loescheKruemel(posX, posY);
                verwundbar = false;
            }
            else {
                spielfeld.loescheKruemel(posX, posY);    
            }
        } 
    }
}