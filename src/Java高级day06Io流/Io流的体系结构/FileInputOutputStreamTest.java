package Java高级day06Io流.Io流的体系结构;

import org.junit.Test;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author shkstart
 * @company 尚硅谷实习谷粉
 * @date 2022-01-14 18:07
 * @Description:
 * @name 李铭洋
 *
 * 结论：
 * 1. 对于文本文件(.txt,.java,.c,.cpp)，使用字符流处理
 * 2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt,...)，使用字节流处理
 *
 **/
public class FileInputOutputStreamTest {

    @Test
    public void testFileInputStream()  {
        //1.造文件
        FileInputStream fis= null;
        try {
            File file=new File("hello.txt");

            //2.造流
            fis = new FileInputStream(file);

            //3.读数据
            byte[] buffer=new byte[5];
            int len;//记录每次读取的字节的个数
            while ((len=fis.read(buffer))!=-1)
            {
                String str=new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis!=null)
            {
                try {
                    //4.关闭资源
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
    实现对图片的复制操作
     */
    @Test
    public void testFileInputOutputStream(){

        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            File srcFile=new File("爱情与友情.jpg");
            File destFile=new File("爱情与友情2.jpg");

            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer=new byte[5];
            int len;
            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null)
            {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (fis!=null)
            {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //指定路径下文件的复制
    public void copyFile(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //复制的过程
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                //
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    @Test
    public void testCopyFile(){

        long start = System.currentTimeMillis();

        String srcPath = "E:\\尚硅谷Java学科全套教程（总207.77GB）\\1.尚硅谷全套JAVA教程--基础必备（67.32GB）\\尚硅谷宋红康Java核心基础_好评如潮（30天入门）\\Java基础全套视频教程\\day00_编程入门\\01-尚硅谷-Java语言基础-资料文件结构1.avi";
        String destPath = "E:\\尚硅谷Java学科全套教程（总207.77GB）\\1.尚硅谷全套JAVA教程--基础必备（67.32GB）\\尚硅谷宋红康Java核心基础_好评如潮（30天入门）\\Java基础全套视频教程\\day00_编程入门\\02-尚硅谷-Java语言基础-资料文件结构2.avi";


//        String srcPath = "hello.txt";
//        String destPath = "hello3.txt";

        copyFile(srcPath,destPath);


        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为：" + (end - start));//618

    }
}
