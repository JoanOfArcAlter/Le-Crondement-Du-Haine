package test;
public class Hero {
    public String name;
    protected float hp;
      
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        APHero ap = new APHero();
         
        Hero h1= ad;
        Hero h2= ap;
         
        //判断引用h1指向的对象，是否是ADHero类型
        System.out.println(h1 instanceof ADHero);
         
        //判断引用h2指向的对象，是否是APHero类型
        System.out.println(h2 instanceof APHero);
         
        //判断引用h1指向的对象，是否是Hero的子类型
        System.out.println(h1 instanceof Hero);
    }
}


//public class Hero {
//    public String name; //实例属性，对象属性，非静态属性
//    protected float hp;
//    static String copyright;//类属性,静态属性
//     
//    public static void main(String[] args) {
//           Hero garen =  new Hero();
//           garen.name = "盖伦";
//            
//           garen.copyright = "版权由Riot Games公司所有";
//            
//           System.out.println(garen.name);
//           System.out.println(garen.copyright);
//            
//           Hero teemo =  new Hero();
//           teemo.name = "提莫";
//           System.out.println(teemo.name);    
//           System.out.println(teemo.copyright);
//         
//    }
//     
//}
//public class Hero {
//    
//    String name; //姓名
//        
//    float hp; //血量
//        
//    float armor; //护甲
//        
//    int moveSpeed; //移动速度
//     
//    public Hero(){
//         
//    }
//     
//    //回血
//    public void huixue(int xp){
//        hp = hp + xp;
//        //回血完毕后，血瓶=0
//        xp=0;
//    }
//      
//    public Hero(String name,float hp){
//        this.name = name;
//        this.hp = hp;
//    }
// 
//    public static void main(String[] args) {
//        Hero teemo =  new Hero("提莫",383);
//        //血瓶，其值是100
//        int xueping = 100;
//         
//        //提莫通过这个血瓶回血
//         
//        teemo.huixue(xueping);
//         
//        System.out.println(xueping);
//         
//    }
//      
//}