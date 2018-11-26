package zusatzaufgabe;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Zu schreibende Klasse zur Zusatzaufgabe (Auskommentierter Code dient einzig
 * der Erstellung der docx-Datei. Export als PDF wurde manuell vorgenommen)
 * <p>
 * Abgabetermin: 28.10.2018 - 23:55 Uhr
 * Abgabeformat: 1 ZIP Datei + 1 PDF Dokument
 * Maximale Zusatzpunkte: 3
 * <p>
 * Aufgabe:
 * Schreiben Sie innerhalb der von Ihnen gewählten Entwicklungsumgebung
 * folgendes Programm in eine Datei zusatzaufgabe.Name.java. Falls Ihre Entwicklungsumgebung
 * Sie danach fragt, benutzen Sie das package default. Sie müssen das Programm
 * nicht verstehen. Achten Sie beim Abtippen auf korrekte Groß- und
 * Kleinschreibung und vermeiden Sie Tippfehler, insbesondere bei Klammern und
 * Satzzeichen. Die Farben können in Ihrer Entwicklungsumgebung andere sein.
 *
 * @author Martin Zeyner on 19.10.2018 13:32
 * project WiSe201819
 * @version 1.0
 * @since JDK 8
 */
public class Name {
  private static final File file = new File("ModellierungProgrammierung" +
      File.separator + "tests" + File.separator + "zusatz.docx");

  public static void main(String[] args) {
    final String name = "Martin Zeyner";
    final char[] s = new char[name.length()];
    for (int i = 0; i != name.length(); i++) {
      s[i] = name.charAt(name.length() - i - 1);
    }
    System.out.println(s);

    writeOutputIntoTextFile(new String(s));
  }

  private static void writeOutputIntoTextFile(final String output) {
    if (checkWriteOutputIntoTextFile()) {
      try (final FileWriter writer = new FileWriter(file.getPath())) {
        writer.write(output);
      } catch (final IOException ex) {
        ex.printStackTrace();
      }
    }
  }

  private static boolean checkWriteOutputIntoTextFile() {
    if (!file.exists()) {
      try {
        return file.createNewFile();
      } catch (final IOException ex) {
        ex.printStackTrace();
      }
    }
    return true;
  }
}