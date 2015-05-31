/**
 * Created by asmalouski on 31.5.15.
 */
public class user {
    public static void main(String args[]){
        Alice al = new Alice();
        Kate ka = new Kate();
        Ann an = new Ann();

        String AliceName = al.myName();
        String KateNme = ka.myName();
        String AnnName = an.myName();

        John jo = new John();
        Mike mi = new Mike();
        Peter pe = new Peter();

        String JohnName = jo.myName();
        String MikeName = mi.myName();
        String PeterName = pe.myName();

        String ALiceName = al.myName();
        System.out.println("Hello i'm "+AliceName+" and my boyfriend is "+JohnName);
        System.out.println("Hello i'm "+KateNme+" and my boyfriend is "+MikeName);
        System.out.println("Hello i'm "+AnnName+" and my boyfriend is "+PeterName);

    }
}
