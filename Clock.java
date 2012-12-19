package unittests;

/**
 * Dieses Interface legt Methoden für Klassen fest, die Uhren implementieren.
 * 
 * Als Konstruktoren werden der Default-Konstruktor (initialisiert die Uhrzeit auf 00:00:00) 
 * und ein Konstruktor mit 3 Parametern (int stunde, int minute, int sekunde) vorgeschlagen.
 * Die Konstruktoren sollten IllegalArgumentExceptions im Falle falscher Parameter werfen.
 * 
 * @author Erhard List
 * @version 20121206
 */
public interface Clock {

	/**
	 * Stellt die Uhr auf eine neue Uhrzeit.
	 * 
	 * @param hour die Stunden der Uhrzeit im Bereich 0-23
	 * @param minute die Minuten der Uhrzeit im Bereich 0-59
	 * @param second die Sekunden der Uhrzeit im Bereich 0-59
	 * @throws IllegalArgumentException im Fall, dass einer der Parameter einen Wert außerhalb des angegebenen Bereiches enthält
	 */
	public void setTime(int hour, int minute, int second) throws IllegalArgumentException;
	
	/**
	 * Stellt die Uhr um exakt eine Sekunde weiter
	 */
	public void tick();
	
	/**
	 * Liefert die Uhrzeit als formatierten String zurück
	 * @return die Uhrzeit im Format hh:mm:ss
	 */
	public String showTime();
	
	/**
	 * Liefert die Uhrzeit als drei int-Werte
	 * @return Uhrzeit als int-Werte in der Reihenfolge Stunden (Index 0), Minuten (Index 1), Sekunden (Index 2)
	 */
	public int[] getTime();
	
}
