import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AccountExport {
    public AccountExport() {
    }
    public void export(Account acc) {
        try {
            FileWriter archive = new FileWriter("Conta de " + acc.masterName + ".txt");
            PrintWriter writeArchive = new PrintWriter(archive);
            writeArchive.println(acc);
            writeArchive.println("DETAILED STATS: \n");
            for (Servant servant : acc.servantsInventory) {
                writeArchive.println(servant);
            }
            archive.close();
        }
        catch (IOException e) {
            System.err.println("Não foi possivel encontrar o arquivo.");
        }
    }
}
