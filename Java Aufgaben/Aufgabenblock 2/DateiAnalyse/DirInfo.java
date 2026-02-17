package DateiAnalyse;

public class DirInfo {
    private String privileges;
    private String nameOwner;
    private String nameEntry;

    public DirInfo(String line) {
        String[] parts = line.trim().split("\\s+");
        if (parts.length >= 8) {
            this.privileges = parts[0];
            this.nameOwner = parts[2];

            StringBuilder entryBuilder = new StringBuilder();
            for (int i = 7; i < parts.length; i++) {
                entryBuilder.append(parts[i]);
                if (i < parts.length - 1) entryBuilder.append(" ");
            }
            this.nameEntry = entryBuilder.toString().trim();
        } else {
            this.privileges = "invalid";
            this.nameOwner = "unknown";
            this.nameEntry = "unknown";
        }
    }

    public String getPrivileges() {
        return privileges;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public String getNameEntry() {
        return nameEntry;
    }

    public String toString() {
        return "DirInfo:\nfilename: " + nameEntry + "\nowner: " + nameOwner + "\nprivileges: " + privileges + "\n================";
    }
}
