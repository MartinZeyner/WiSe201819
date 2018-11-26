package zug;

/**
 * Description
 *
 * @author Abgie on 11.11.2018 15:37
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Speisewagen extends Wagen {
  private boolean warmesEssen;

  public Speisewagen(boolean warmesEssen, short sitzplaetze) {
    super(sitzplaetze);
    this.warmesEssen = warmesEssen;
  }

  public boolean isWarmesEssen() {
    return warmesEssen;
  }

  public void setWarmesEssen(boolean warmesEssen) {
    this.warmesEssen = warmesEssen;
  }
}
