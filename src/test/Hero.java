package test;
public class Hero {
    public String name;
    protected float hp;
      
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
         
        Hero h1= ad;
        Hero h2= ap;
         
        //�ж�����h1ָ��Ķ����Ƿ���ADHero����
        System.out.println(h1 instanceof ADHero);
         
        //�ж�����h2ָ��Ķ����Ƿ���APHero����
        System.out.println(h2 instanceof APHero);
         
        //�ж�����h1ָ��Ķ����Ƿ���Hero��������
        System.out.println(h1 instanceof Hero);
    }
}


//public class Hero {
//    public String name; //ʵ�����ԣ��������ԣ��Ǿ�̬����
//    protected float hp;
//    static String copyright;//������,��̬����
//     
//    public static void main(String[] args) {
//           Hero garen =  new Hero();
//           garen.name = "����";
//            
//           garen.copyright = "��Ȩ��Riot Games��˾����";
//            
//           System.out.println(garen.name);
//           System.out.println(garen.copyright);
//            
//           Hero teemo =  new Hero();
//           teemo.name = "��Ī";
//           System.out.println(teemo.name);    
//           System.out.println(teemo.copyright);
//         
//    }
//     
//}
//public class Hero {
//    
//    String name; //����
//        
//    float hp; //Ѫ��
//        
//    float armor; //����
//        
//    int moveSpeed; //�ƶ��ٶ�
//     
//    public Hero(){
//         
//    }
//     
//    //��Ѫ
//    public void huixue(int xp){
//        hp = hp + xp;
//        //��Ѫ��Ϻ�Ѫƿ=0
//        xp=0;
//    }
//      
//    public Hero(String name,float hp){
//        this.name = name;
//        this.hp = hp;
//    }
// 
//    public static void main(String[] args) {
//        Hero teemo =  new Hero("��Ī",383);
//        //Ѫƿ����ֵ��100
//        int xueping = 100;
//         
//        //��Īͨ�����Ѫƿ��Ѫ
//         
//        teemo.huixue(xueping);
//         
//        System.out.println(xueping);
//         
//    }
//      
//}