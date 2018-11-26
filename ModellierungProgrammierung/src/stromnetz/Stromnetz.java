package stromnetz;

/**
 * Created by Abgie on 25.11.2018 for WiSe201819
 */
public class Stromnetz {
  private final Erzeuger[] erzeuger;
  private final Verbraucher[] verbraucher;

  public Stromnetz() {
    this.erzeuger = new Erzeuger[20];
    this.verbraucher = new Verbraucher[100];
  }

  public void fuegeErzeugerHinzu(Erzeuger erzeuger) {
    for (int i = 0; i < 20; i++) {
      if (this.erzeuger[i] == null) {
        this.erzeuger[i] = erzeuger;
        break;
      }
    }
  }

  public void entferneErzeuger(Erzeuger erzeuger) {
    for (int i = 0; i < 20; i++) {
      if (this.erzeuger[i].equals(erzeuger)) {
        this.erzeuger[i] = null;
        break;
      }
    }
  }

  public void fuegeVerbraucherHiinzu(Verbraucher verbraucher) {
    for (int i = 0; i < 100; i++) {
      if (this.verbraucher[i] == null) {
        this.verbraucher[i] = verbraucher;
        break;
      }
    }
  }

  public void entferneVerbraucher(Verbraucher verbraucher) {
    for (int i = 0; i < 100; i++) {
      if (this.verbraucher[i].equals(verbraucher)) {
        this.verbraucher[i] = null;
        break;
      }
    }
  }

  public Erzeuger[] getErzeuger() {
    return erzeuger;
  }

  public Verbraucher[] getVerbraucher() {
    return verbraucher;
  }
}
