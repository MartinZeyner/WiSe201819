package stromnetz;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
public class Erzeuger {
  private final double leistung;

  public Erzeuger(double leistung) {
    this.leistung = leistung;
  }

  public boolean starten() {
    return false;
  }

  public boolean anhalten() {
    return false;
  }

  public double getLeistung() {
    return leistung;
  }
}
