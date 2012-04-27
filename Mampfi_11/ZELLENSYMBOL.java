/**
*
*Diese Klasse dient zur Dastellung einer ZELLE. Dabei ist darauf zu achten, dass
*die ZELLENDARSTELLUNG erst sichtbar wird, wenn ihr x- und y-Position &uuml;bergeben wurden.
*Einmal &uuml;bergeben, lassen sich die Koordinaten nicht mehr aendern.
*Willst Du z.B. die mit Mausklicks die ZELLE ver�ndern, musst Du sie zuerst an das backend &uuml;bergeben.
*Nutze dazu die Methode Anmelden().
*
*@author Sebastian Zinkhahn
*/

public class ZELLENSYMBOL extends ZellDarstellungImpl
{
  int positionX = super.positionX;
  int positionY = super.positionY;
  String fuellFarbe = "blau";
  String randFarbe = "schwarz";
  boolean fuellungSichtbar = false;
  boolean randSichtbar = true;
  
  /**
   * Erzeugt eine Zelle mit der angebeneben x- und y-Position im Labyrinth
   * @param xNeu
   * @param yNeu
   */
  public ZELLENSYMBOL(int xNeu, int yNeu)
  {
    super(xNeu, yNeu);
    super.FuellFarbeSetzen(fuellFarbe);
    super.FuellungSichtbarSetzen(fuellungSichtbar);
    super.RandFarbeSetzen(randFarbe);
    super.RandSichtbarSetzen(randSichtbar);
  }

//  /**
//   * Setzt die x- und y-Position der Darstellung.
//   * Diese Methode kann nur einmal(!) benutzt werden.
//   * Danach wirken sich die �nderungen nicht mehr aus.
//   * @see ZellDarstellungImpl#PositionXYSetzen(int, int)
//   */
//  public void PositionXYSetzen(int xNeu, int yNeu)
//  {
//    if(!super.init)
//    {
//      positionX = xNeu;
//      positionY = yNeu;
//    }
//    super.PositionXYSetzen(xNeu, yNeu);
//  }

  
 
  
  /**
   * �ndert die F&uuml;llfarbe dieses Symbols
   * @see KruemelDarstellungImpl#FarbeSetzen(java.lang.String)
   */
  public void FuellFarbeSetzen(String farbeNeu)
  {
    fuellFarbe = farbeNeu;
    super.FuellFarbeSetzen(farbeNeu);
  }
  
  /**
   * �ndert die Randfarbe dieses Symbols
   * @see backend.view.DarstellungImpl#RandFarbeSetzen(java.lang.String)
   */
  public void RandFarbeSetzen(String farbeNeu)
  {
    randFarbe = farbeNeu;
    super.RandFarbeSetzen(farbeNeu);
  }
  
  /**
   * Gibt an ob das Symbol ausgef&uuml;llt werden soll
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
}