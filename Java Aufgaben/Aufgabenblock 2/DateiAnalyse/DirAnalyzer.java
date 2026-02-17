package DateiAnalyse;

import java.io.*;
import java.util.*;

public class DirAnalyzer {
    private ArrayList<DirInfo> infoList = new ArrayList<>();

    public void analyze(String filename) throws IOException {
        Scanner scanner = new Scanner(new FileReader(filename));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            DirInfo info = new DirInfo(line);
            infoList.add(info);
        }
        scanner.close();
    }

    public void print() {
        for (DirInfo info : infoList) {
            System.out.println(info);
        }
    }
}

