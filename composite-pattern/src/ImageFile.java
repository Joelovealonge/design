/**
 * @description 叶子构件
 * @Author
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name){
        this.name = name;
    }
    @Override
    public void killVirus() {
        System.out.println("对图像文件" + name + "进行杀毒");
    }
}
