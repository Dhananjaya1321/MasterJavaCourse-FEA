package Video15;

//import Video15.Sub1.DefaultAccessModifier;
import Video15.Sub1.PrivateAccessModifier;
import Video15.Sub1.ProtectedAccessModifier;
import Video15.Sub1.PublicAccessModifier;

public class Main/* extends FinalKeyword*/{
    public static void main(String[] args) {
        PublicAccessModifier publicAccessModifier = new PublicAccessModifier();
        publicAccessModifier.publicVariable=10;

//
//        PrivateAccessModifier privateAccessModifier=new PrivateAccessModifier();
//        privateAccessModifier.privateVariable=10;
//
//        ProtectedAccessModifier protectedAccessModifier = new ProtectedAccessModifier();
//        protectedAccessModifier.protectedValue=10;
//
//        DefaultAccessModifier defaultAccessModifier = new DefaultAccessModifier();
    }
}
