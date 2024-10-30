package exampleOne.receiver;

public class TextFile {
    private String fileName;

    public TextFile(String fileName) {
        this.fileName = fileName;
    }

    // constructor

    public String open() {
        System.out.println("Opening file " + fileName);
        return "Opening file " + fileName;
    }

    public String save() {
        System.out.println("Saving file " + fileName);
        return "Saving file " + fileName;
    }

    // additional text file methods (editing, writing, copying, pasting)
}
