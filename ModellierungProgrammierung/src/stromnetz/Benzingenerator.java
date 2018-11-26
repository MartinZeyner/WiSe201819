package stromnetz;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
public class Benzingenerator extends Erzeuger {
  private double hubraum;

  public Benzingenerator(double hubraum) {
    super(hubraum);
    this.hubraum = hubraum;
  }

}
