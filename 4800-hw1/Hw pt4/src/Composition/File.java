package Composition;

public class File {
    private String name;
    private Folder parentFolder;

    public File(String name, Folder parentFolder) {
        this.name = name;
        this.parentFolder = parentFolder;
    }

    public void delete() {
        parentFolder.removeFile(this);
    }

    public void print() {
        System.out.println(name);
    }
}