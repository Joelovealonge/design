abstract class AbstractFile {
    public void add(AbstractFile file){
        throw new RuntimeException("文件不支持该操作");
    }
    public void remove(AbstractFile file) {
        throw new RuntimeException("文件不支持该操作");
    }
    public AbstractFile getChild(int i) {
        throw new RuntimeException("文件不支持该操作");
    }
    public abstract void killVirus();
}
