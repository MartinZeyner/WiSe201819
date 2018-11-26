package mensabetrieb;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
class Gast {
  private boolean fertig;
  private final double geschwindigkeit;
  private final Gericht gericht;

  Gast(double geschwindigkeit, Gericht gericht) {
    this.geschwindigkeit = geschwindigkeit;
    this.gericht = gericht;
  }

  void simuliere() {
    fertig = !gericht.iss(this);
    System.out.print(fertig ? "INFO: Gast hat " + gericht.toString() + " aufgegessen\n":"");
  }

  double getGeschwindigkeit() {
    return geschwindigkeit;
  }

  boolean istFertig() {
    return fertig;
  }
}
