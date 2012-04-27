class SPIELSTEUERUNG {
    private MAMPFI mampfi;
    private LABYRINTH spielfeld;
    private STEUERUNGSANZEIGE anzeige;
    public char ausgabe;
    int punkte;
    int leben;
    
    public SPIELSTEUERUNG() {
        spielfeld = new LABYRINTH();
        mampfi = new MAMPFI(spielfeld);
        anzeige = new STEUERUNGSANZEIGE();
        anzeige.Anmelden(this);
    }
    
    void AufTasteReagieren(int taste) {
        switch(taste) {
            case 37: 
                mampfi.laufNachWesten();
                break;
            case 38:
                mampfi.laufNachNorden();
                break;
            case 39:
                mampfi.laufNachOsten();
                break;
            case 40:
                mampfi.laufNachSueden();
                break;
        }
    }
    
    void verwundbarSetzen(boolean v) {
        mampfi.verwundbarSetzen(v);
    }
    
    public char zelleAuswerten(int x, int y){
        if(spielfeld.hatKruemel(x, y) == true) {
            ausgabe = 'K';
            
        }
        else{
            if(spielfeld.hatPowerball(x, y) == true) {
                ausgabe = 'P';
            }
            else{
                ausgabe = 'N';
            }
        }
        
        return ausgabe;
    
    }
}