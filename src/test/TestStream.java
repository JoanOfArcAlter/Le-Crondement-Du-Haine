package test;

import java.io.IOException;
import java.io.InputStream;

public class TestStream {
    public static void main(String[] args) {
        // ����̨����
        try (InputStream is = System.in;) {
            while (true) {
                // ����a,Ȼ���ûس����Կ���
                // 97 13 10
                // 97��a��ASCII��
                // 13 10�ֱ��Ӧ�س�����
                int i = is.read();
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//    static File f =new File("l:/data.txt");
//    static int x = 31;
//    static int y = 15;
//    static int z = 5;
//    public static void main(String[] args) {
//        //��������ʽ
//        method2();
//    }
//    private static void method2() {
//        try (
//                FileInputStream fis  = new FileInputStream(f);
//                DataInputStream dis =new DataInputStream(fis);
//                FileOutputStream fos  = new FileOutputStream(f);
//                DataOutputStream dos =new DataOutputStream(fos);
//                 
//        ){
//            dos.writeInt(x);
//            dos.writeInt(y);
//            dos.writeInt(z);
//             
//            int a = dis.readInt();
//            int b = dis.readInt();
//            int c = dis.readInt();
//            System.out.printf("ʹ����������ȡ���� %d %d %d %n",a,b,c);
//             
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//         
//    }
//  
}
