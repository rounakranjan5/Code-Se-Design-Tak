import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{
    private String name;
    private List<FileSystemItem> children;

    public Folder(String name) {
        this.name = name;
        children=new ArrayList<>();
    }

    public void add(FileSystemItem item){
        children.add(item);
    }

    @Override
    public void ls(int indent) {
        String indentSpaces=" ".repeat(indent);
        for (FileSystemItem child : children){
            if (child.isFolder()){
                System.out.println(indentSpaces+"+ "+child.getName());
            }else{
                System.out.println(indentSpaces+child.getName());
            }
        }
    }

    @Override
    public void openAll(int indent) {
        String indentSpaces=" ".repeat(indent);
        System.out.println(indentSpaces+"+ "+name);
        for (FileSystemItem child : children)
            child.openAll(indent+4);
    }

    @Override
    public int getSize() {
        int size=0;
        for(FileSystemItem child : children){
            size+=child.getSize();
        }
        return size;
    }

    @Override
    public FileSystemItem cd(String target) {

        for (FileSystemItem child : children){
            if (child.isFolder() && child.getName().equals(target))
                return child;
        }

        // not found or not a folder
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFolder() {
        return true;
    }
}
