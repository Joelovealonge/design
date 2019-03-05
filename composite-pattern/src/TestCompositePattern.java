public class TestCompositePattern {
    public static void main(String[] args) {
        AbstractFile dir = new Folder("武功秘籍");
        AbstractFile dir1 = new Folder("段誉");
        AbstractFile file = new ImageFile("段誉的图片文件");
        AbstractFile file1 = new TextFile("六脉神剑");
        dir1.add(file);
        dir.add(file1);
        dir1.add(dir);
        dir1.killVirus();
    }
}
