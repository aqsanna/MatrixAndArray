package MyPack;

import java.sql.SQLOutput;

public class Balance {
    String name ;
    Double bal ;

    Balance(String n, Double b){
        name=n;
        bal=b;
    }
    void show(){
        if(bal<0){
            System.out.print("--->");
            System.out.println(name + "· $" + bal);
        }
    }
}
