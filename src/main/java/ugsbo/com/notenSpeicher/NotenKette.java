package ugsbo.com.notenSpeicher;

public class NotenKette {

  Noten Workingobjekt;
  
  public NotenKette() {
    Workingobjekt = new Noten("first", 0);
  }

  public double durchschnitt() {
    return Workingobjekt.getDurchschnitt();
  }

  public void add(String eingabeFach, int eingabeNote) {
    Noten newWorkingObjekt = new Noten(eingabeFach,eingabeNote, Workingobjekt.previousHash, Workingobjekt.durchschnitt, Workingobjekt);
    Workingobjekt = newWorkingObjekt;
  }

  
}
