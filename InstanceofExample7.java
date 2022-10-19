package InstanceOf;

public class InstanceofExample7 {

    void invoke(InstanceofExample4 I){ //upcasting
        if(I instanceof InstanceofExample5){
            InstanceofExample5 use1 = (InstanceofExample5) I; //downcasting
            use1.use1();
        }
        if(I instanceof InstanceofExample6){
            InstanceofExample6 use2 = (InstanceofExample6) I; //downcasting
            use2.use2();
        }
    }
}
