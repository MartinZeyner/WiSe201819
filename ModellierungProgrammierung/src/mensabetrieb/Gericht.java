package mensabetrieb;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
class Gericht {
  private double gewicht;
  private final String name;

  Gericht(double gewicht, String name) {
    this.gewicht = gewicht;
    this.name = name;
  }

  boolean iss(Gast gast) {
    gewicht =- gast.getGeschwindigkeit();
    return gewicht > 0;
  }

  @Override
  public String toString() {
    return name;
  }
}