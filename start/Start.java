import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Start {
    private static final String[] CALENDAR_FILES = {"calendars.properties", "hijrah-config-umalqura.properties"};

    public static void main(String[] args) throws Exception {
        java.util.TimeZone.getDefault();
        java.time.ZoneId.systemDefault().getRules();
        File lib = new File("/files/.digital-web/jre8/lib");
        lib.mkdirs();
        for (String name : CALENDAR_FILES) {
            try (InputStream in = Start.class.getResourceAsStream("/jre8/lib/" + name)) {
                Files.copy(in, new File(lib, name).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
        }
        String home = System.getProperty("java.home");
        System.setProperty("java.home", lib.getParent());
        try {
            Class.forName("java.time.chrono.JapaneseEra");
            Class.forName("java.time.chrono.HijrahChronology");
        } finally {
            System.setProperty("java.home", home);
        }
        de.neemann.digital.gui.Main.main(args);
    }
}
