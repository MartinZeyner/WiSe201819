package autowerkstatt;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 16:11
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Autowerkstatt {
  private Auto[] autos;

  public Autowerkstatt(Auto[] autos) {
    this.autos = autos;
  }

  public Auto[] getAutos() {
    return autos;
  }

  public void setAutos(Auto[] autos) {
    this.autos = autos;
  }
}
