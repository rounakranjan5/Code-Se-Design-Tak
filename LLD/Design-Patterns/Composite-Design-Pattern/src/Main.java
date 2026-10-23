public class Main {
    public static void main(String[] args) {

        Folder root=new Folder("root");
        root.add(new File("file1.txt",1));
        root.add(new File("file2.txt",1));

        Folder docs=new Folder("docs");
        docs.add(new File("test.pdf",1));
        docs.add(new File("test2.pdf",1));
        root.add(docs);

        Folder images=new Folder("images");
        images.add(new File("img1.png",1));
        images.add(new File("img2.png",1));
        root.add(images);

        System.out.println("----------");
        root.ls(0);

        System.out.println("----------");
        docs.ls(0);

        System.out.println("----------");
        root.openAll(0);

        System.out.println("----------");
        FileSystemItem cwd=root.cd("docs");

        System.out.println("----------");
        if(cwd!=null) cwd.ls(0);
        else System.out.println("\n Couldn't cd into "+cwd.getName());

        System.out.println(root.getSize());
    }
}
