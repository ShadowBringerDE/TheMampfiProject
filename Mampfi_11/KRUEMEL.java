public class KRUEMEL{
    boolean powerKruemel;
    int posX;
    int posY;
    KRUEMELSYMBOL symbol;
    
    public KRUEMEL(int x, int y){
        powerKruemel = false;
        posX = x;
        posY = y;
        symbol = new KRUEMELSYMBOL(x,y);
        symbol.RadiusSetzen(3);
        symbol.FuellFarbeSetzen("weiss");
        symbol.RandFarbeSetzen("weiss");
    }
    
    void loescheKruemel(){
        symbol.KruemelSymbolEntfernen();
        symbol = null;
    }
    
    void powBall(){
        powerKruemel = true;
        if(powerKruemel == true){
            symbol.RadiusSetzen(10);
            symbol.FuellFarbeSetzen("gelb");
            symbol.RandFarbeSetzen("gelb");
        }
    }
    
    boolean hatPower(){
        return powerKruemel;
    }
    
}