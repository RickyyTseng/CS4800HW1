package Composition;

import java.util.List;
import java.util.ArrayList;
public class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public void addSubFolder(Folder subFolder) {
        this.subFolders.add(subFolder);
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void delete() {
        for (Folder subFolder : new ArrayList<>(subFolders)) {
            subFolder.delete();
            this.subFolders.remove(subFolder);
        }
        for (File file : new ArrayList<>(files)) {
            file.delete();
            this.files.remove(file);
        }
    }

    public void removeFile(File file){
        files.remove(file);
    }

    public void print() {
        System.out.println(name);
        for (Folder subFolder : subFolders) {
            subFolder.print();
        }
        for (File file : files) {
            file.print();
        }
    }
}