package test;
 
public class TestString {
 
    public static void main(String[] args) {
 
        String[] ss = new String[100];
        // ��ʼ��
        for (int i = 0; i < ss.length; i++) {
            ss[i] = randomString(2);
        }
        // ��ӡ
        for (int i = 0; i < ss.length; i++) {
            System.out.print(ss[i] + " ");
            if (19 == i % 20)
                System.out.println();
        }
 
        for (String s1 : ss) {
            int repeat = 0;
            for (String s2 : ss) {
                if (s1.equalsIgnoreCase(s2)) {
                    repeat++;
                    if (2 == repeat) {
                        // ��repeat==2��ʱ�򣬾��Ҵ���һ���Ǽ����ظ��ַ���
 
                        putIntoDuplicatedArray(s1);
                        break;
                    }
                }
            }
        }
 
        System.out.printf("�ܹ��� %d���ظ����ַ���%n", pos);
        if (pos != 0) {
            System.out.println("�ֱ��ǣ�");
            for (int i = 0; i < pos; i++) {
                System.out.print(foundDuplicated[i] + " ");
            }
        }
    }
 
    static String[] foundDuplicated = new String[100];
    static int pos;
 
    private static void putIntoDuplicatedArray(String s) {
        for (int i = 0; i < pos; i++){
            if (foundDuplicated[i].equalsIgnoreCase(s))
                return;
        }
 
        foundDuplicated[pos++] = s;
    }
 
    private static String randomString(int length) {
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);
        return result;
    }
 
}

//package test;
//
//import java.util.Arrays;
//
//public class TestString {
//	public static void main(String[] args) {
//        String[] ss = new String[8];
//        for (int i = 0; i < ss.length; i++) {
//            String randomString = GetString(5);
//            ss[i] = randomString;
//        }
//        System.out.println("δ����ǰ���ַ�������:");
//        System.out.println(Arrays.toString(ss));
// 
//        for (int j = 0; j < ss.length; j++) {
//            for (int i = 0; i < ss.length - j - 1; i++) {
//                char firstChar1 = ss[i].charAt(0);
//                char firstChar2 = ss[i + 1].charAt(0);
//                firstChar1 = Character.toLowerCase(firstChar1);
//                firstChar2 = Character.toLowerCase(firstChar2);
// 
//                if (firstChar1 > firstChar2) {
//                    String temp = ss[i];
//                    ss[i] = ss[i + 1];
//                    ss[i + 1] = temp;
//                }
//            }
//        }
// 
//        System.out.println("�������ַ�������:");
//        System.out.println(Arrays.toString(ss));
// 
//	}
//	public static String GetString(int length) {
//		String s = "";
//		for(short i = '0';i <= '9';i++){
//			s += (char)i;
//		}
//		for(short i = 'a';i <= 'z';i++){
//			s += (char)i;
//		}
//		for(short i = 'A';i <= 'Z';i++){
//			s += (char)i;
//		}
//		char cs[] = new char[length];
//		for(int i = 0;i < cs.length;i++){
//			int index = (int)(Math.random()*s.length());
//			cs[i] = s.charAt(index); 
//		}
//		String newString = new String(cs);
//		return newString;
//	}
//}
