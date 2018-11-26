package stromnetz;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
public class Solarzelle extends Erzeuger {
  private double groesse;

  public Solarzelle(double groesse) {
    super(groesse);
    this.groesse = groesse;
  }
}
