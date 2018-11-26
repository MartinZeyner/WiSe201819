package stromnetz;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
public class Verbraucher {
  private final double verbrauch;

  public Verbraucher(double verbrauch) {
    this.verbrauch = verbrauch;
  }

  public boolean starten() {
    return false;
  }

  public boolean anhalten() {
    return false;
  }

  public double getVerbrauch() {
    return verbrauch;
  }
}
