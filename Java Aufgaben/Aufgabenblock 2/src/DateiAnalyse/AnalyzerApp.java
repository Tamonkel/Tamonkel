package DateiAnalyse;

import java.io.*;

public class AnalyzerApp {
    public static void main(String[] args) throws IOException {
        DirAnalyzer analyzer = new DirAnalyzer();
        analyzer.analyze("C:\\Users\\Bernhard\\IdeaProjects\\Aufgabenblock 2\\src\\DateiAnalyse\\filenames.txt");
        analyzer.print();
    }
}
