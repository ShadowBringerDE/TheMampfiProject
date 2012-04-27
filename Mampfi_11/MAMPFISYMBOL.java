import backend.anzeige.Einstellungen;

/**
 *Diese Klasse dient zur Darstellung des Mampfi und zum anmelden des MAMPFI-Objekts am backend.
 *@author Sebastian Zinkhahn
 */
class MAMPFISYMBOL extends MampfiDarstellungImpl
{
	/**Die x-Position.*/
	int positionX;
	/**Die y-Position.*/
	int positionY;
	/**Der Radius.*/
	int radius; 
	 /**Gibt den Startwinkel des Bogens von der horizontalen Achse aus gesehen in Grad an.*/
	int startWinkel;
	 /**Gibt den Bogenumfang in Grad an.*/
	int bogenWinkel;
	/**Gibt an wie und ob der Bogen geschlossen ist.<br> Erlaubt sind: 0, 1, 2.*/
	int bogenArt; 
	/**Die Farbe, mit der das Symbol ausgefuellt werden soll.*/
	String fuellFarbe;
	/**Die Farbe, mit der der Rand des Symbols gezeichnet werden soll.*/
	String randFarbe;
	/**Gibt an, ob das Symbol ausgefuellt werden soll.*/
	boolean fuellungSichtbar;
	/**Gibt an, ob der Rand des Symbols gezeichnet werden soll.*/
	boolean randSichtbar;
	/**Gibt an ob sich der Mund sich abwechselnd &ouml;ffnet und schlie&szlig;t */
	boolean mundBewegtSich;

	/** Erzeugt ein neues Objekt dieser Klasse mit Standardwerten.
	 */
	public MAMPFISYMBOL()
	{
		super();
		radius = Einstellungen.ZellenRadiusGeben();
		startWinkel = (int) super.startWinkel;
		bogenWinkel = (int) super.bogenWinkel;
		bogenArt = super.bogenArt;
		fuellFarbe = "gelb";
		randFarbe = "gelb";
		fuellungSichtbar = true;
		randSichtbar = true;
		super.FuellFarbeSetzen(fuellFarbe);
		super.FuellungSichtbarSetzen(fuellungSichtbar);
		super.RandFarbeSetzen(randFarbe);
		super.RandSichtbarSetzen(randSichtbar);
	}
	
	/**Erzeugt ein neues Objekt dieser Klasse mit den &uuml;bergegebenen x- und y-Werten.
	 * @param xNeu die x-Position
	 * @param yNeu die y-Position
	 */
	public MAMPFISYMBOL(int xNeu, int yNeu)
	{
		super(xNeu, yNeu);
		positionX = xNeu;
		positionY = yNeu;
		radius = Einstellungen.ZellenRadiusGeben();
		startWinkel = (int) super.startWinkel;
		bogenWinkel = (int) super.bogenWinkel;
		bogenArt = super.bogenArt;
		fuellFarbe = "gelb";
		fuellFarbe = "gelb";
		randFarbe = "gelb";
		fuellungSichtbar = true;
		randSichtbar = true;
		super.FuellFarbeSetzen(fuellFarbe);
		super.FuellungSichtbarSetzen(fuellungSichtbar);
		super.RandFarbeSetzen(randFarbe);
		super.RandSichtbarSetzen(randSichtbar);
	}
	
	/**Weist dem Attribut radius einen neuen Wert zu.
	 * @param radiusNeu der neue Wert
	 */
	void RadiusSetzen(int radiusNeu)
	{
		if(radiusNeu >= 0 && radiusNeu <= Einstellungen.ZellenRadiusGeben())
		{
			radius = radiusNeu;
			super.RadiusSetzen(radiusNeu);
		}
		else System.err.println("Der Radius darf nicht negativ und nicht gr\u00f6\u00dfer als der Zellradius sein");
	}
	
	/**Weist dem Attribut startWinkel einen neuen Wert zu.
	 * @param winkelNeu der neue Wert
	 */
	void StartWinkelSetzen(int winkelNeu)
	{	
		super.StartWinkelSetzen(winkelNeu);
		startWinkel = winkelNeu;
	}
	
	/**Weist dem Attribut bogenWinkel einen neuen Wert zu.
	 * @param winkelNeu der neue Wert
	 */
	void BogenWinkelSetzen(int winkelNeu)
	{
		super.BogenWinkelSetzen(winkelNeu);
		bogenWinkel = winkelNeu;
	}
	
	/**Weist dem Attribut bogenArt einen neuen Wert zu.
	 * @param bogenArtNeu der neue Wert<br>
	 * 0 - offen,
	 * 1 - Segment,
	 * 2 - Kuchenstueck
	 */
	void BogenArtSetzen(int bogenArtNeu)
	{
		super.BogenArtSetzen(bogenArtNeu);
		bogenArt = bogenArtNeu;
	}
	
	/**Weist dem Attribut positionX einen neuen Wert zu.
	 * @param xNeu der neue Wert
	 */
	void PositionXSetzen(int xNeu)
	{
		super.PositionXSetzen(xNeu);
		positionX = xNeu;
	}
	

	/**Weist dem Attribut positionY einen neuen Wert zu.
	 * @param yNeu der neue Wert
	 */
	void PositionYSetzen(int yNeu)
	{
		super.PositionYSetzen(yNeu);
		positionY = yNeu;
	}
	
	/**Weist dem Attribut fuellFarbe einen neuen Wert zu
	 * @param farbeNeu der neue Wert (Name der Farbe)
	 */
	void FuellFarbeSetzen(String farbeNeu)
	{
		fuellFarbe = farbeNeu;
		super.FuellFarbeSetzen(farbeNeu);
	}
	
	/** Weist dem Attribut randFarbe einen neuen Wert zu
	 * @param farbeNeu der neue Wert (Name der Farbe)
	 */
	void RandFarbeSetzen(String farbeNeu)
	{
		randFarbe = farbeNeu;
		super.RandFarbeSetzen(farbeNeu);
	}
	
	/** Weist dem Attribut fuellungSichtbar einen neuen Wert zu
	 * @param sichtbarNeu true f&uuml;r sichtbar, false f&uuml;r unsichtbar
	 */
	void FuellungSichtbarSetzen(boolean sichtbarNeu)
	{
		fuellungSichtbar = sichtbarNeu;
		super.FuellungSichtbarSetzen(sichtbarNeu);
	}
	
	/**Weist dem Attribut randSichtbar einen neuen Wert zu
	 * @param sichbarNeu true f&uuml;r sichtbar, false f&uuml;r unsichtbar
	 */
	void RandSichtbarSetzen(boolean sichtbarNeu)
	{
		randSichtbar = sichtbarNeu;
		super.RandSichtbarSetzen(sichtbarNeu);
	}
	


	void MundBewegtSichSetzen(boolean bewegtSichNeu)
	{
		super.Bewegen(bewegtSichNeu);
		mundBewegtSich = bewegtSichNeu;
	}
}