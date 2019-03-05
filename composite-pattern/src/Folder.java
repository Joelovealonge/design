import java.util.ArrayList;

/**
 * @description 容器构件
 */
public class Folder extends AbstractFile{
    private ArrayList<AbstractFile> files= new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        files.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        files.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return files.get(i);
    }
    @Override
    public void killVirus() {
        System.out.println("对文件夹" + name + "进行杀毒");
        for (AbstractFile file : files) {
            file.killVirus();
        }
    }

}
