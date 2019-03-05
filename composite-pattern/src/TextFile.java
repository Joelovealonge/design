/**
 * @description 叶子构件
 * @Author
 */
public class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name){
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("对Text文件" + name + "进行杀毒");
    }
}
