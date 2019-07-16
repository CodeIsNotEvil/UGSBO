package ugsbo.com.notenSpeicher;

public class NotenKette {

  Noten Workingobjekt;
  
  public NotenKette(String eingabeFach, int eingabeNote) {
    Workingobjekt = new Noten(eingabeFach, eingabeNote);
  }

  public double durchschnitt() {
    return Workingobjekt.getDurchschnitt();
  }

  public void add(String eingabeFach, int eingabeNote) {
    if (eingabeNote == 0) return;
    
    Noten newWorkingObjekt = new Noten(eingabeFach,eingabeNote, Workingobjekt.previousHash, Workingobjekt.durchschnitt, Workingobjekt);
    Workingobjekt = newWorkingObjekt;
  }

  
}
