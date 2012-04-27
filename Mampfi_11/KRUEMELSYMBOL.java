import backend.anzeige.Einstellungen;


/**
 * Die KRUEMELDARSTELLUNG stellt einen Kruemel in Form eines Kreises dar
 * Damit der Kruemel angezeigt wird benoetigt er x- und y-Position und
 * dem backend muss bereits eine ZELLE mit den selben x- und y-Werten bekannt sein.
 * Ansonsten kann es zu Fehlermeldungen kommen.
 * @author Sebastian Zinkhahn
 *
 */
public class KRUEMELSYMBOL extends KruemelDarstellungImpl
{
    int positionX;
    int positionY;
    int radius = 6;
    String fuellFarbe = "Weiss";
    String randFarbe = "Weiss";
    boolean fuellungSichtbar = true;
    boolean randSichtbar = false;
    
    /**
     * Erzeugt eine Kruemel mit den angegebenen x- und y-Werten
     * @param xNeu - die x-Position
     * @param yNeu - die y-Position
     */
    public KRUEMELSYMBOL(int xNeu, int yNeu)
    {
        super(xNeu, yNeu);
        positionX = xNeu;
        positionY = yNeu;
        radius = 6;
        fuellFarbe = "weiss";
        randFarbe = "weiss";
        fuellungSichtbar = true;
        randSichtbar = false;
        super.RandFarbeSetzen(randFarbe);
        super.FuellFarbeSetzen(fuellFarbe);
        super.RandSichtbarSetzen(randSichtbar);
        super.FuellungSichtbarSetzen(fuellungSichtbar); 
    }
    
//  /**
//   * Setzt die x- und y-Position der Darstellung.
//   * Diese Methode kann nur einmal(!) benutzt werden.
//   * Danach wirken sich die Aenderungen nicht mehr aus.
//   * @param xNeu
//   * @param yNeu
//   */
//  void PositionXYSetzen(int xNeu, int yNeu)
//  {
//      if(!super.init)
//      {
//          positionX = xNeu;
//          positionY = yNeu;
//          super.PositionXYSetzen(xNeu, yNeu);
//      }
//      
//  }
    
    /**
     * Aendert den Radius der KRUEMELDARSTELLUNG
     * Benutze diese Methode z.B. dafuer um Kruemel mit unterschiedlichem Wert darzustellen.
     * @see KruemelDarstellungImpl#RadiusSetzen(int)
     */
    public void RadiusSetzen(int radiusNeu)
    {
        if(radiusNeu>= 0 && radiusNeu<=Einstellungen.ZellenRadiusGeben()/2);
        {
            radius = radiusNeu;
            super.RadiusSetzen(radiusNeu);
        }
    }
    
    /**
     * Aendert die Fuellfarbe dieses Symbols
     * @see KruemelDarstellungImpl#FarbeSetzen(java.lang.String)
     */
    public void FuellFarbeSetzen(String farbeNeu)
    {
        fuellFarbe = farbeNeu;
        super.FuellFarbeSetzen(farbeNeu);
    }
    
    /**
     * &Auml;ndert die Randfarbe dieses Symbols
     * @see backend.view.DarstellungImpl#RandFarbeSetzen(java.lang.String)
     */
    public void RandFarbeSetzen(String farbeNeu)
    {
        randFarbe = farbeNeu;
        super.RandFarbeSetzen(farbeNeu);
    }
    
    /**
     * Gibt an ob das Symbol ausgefuellt werden soll
     * @see backend.view.DarstellungImpl#FuellungSichtbarSetzen(boolean)
     */
    public void FuellungSichtbarSetzen(boolean b)
    {
        fuellungSichtbar = b;
        super.FuellungSichtbarSetzen(b);
    }
    
    /**
     * Gibt ob der Rand des Symbols gezeichnet werden soll
     * @see backend.view.DarstellungImpl#RandSichtbarSetzen(boolean)
     */
    public void RandSichtbarSetzen(boolean b)
    {
        randSichtbar = b;
        super.RandSichtbarSetzen(b);
    }
    
    public void KruemelSymbolEntfernen()
    {
        super.KruemelSymbolEntfernen();
    }
    
    
}