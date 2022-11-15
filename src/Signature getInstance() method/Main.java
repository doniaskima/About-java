import java.security.*;


public class Main {
    try
    {
        
        String algorithm = "SHA224withRSA"; // we define the Signature algorithm.
        Signature signature = Signature.getInstance(algorithm);
        // We obtain an instance of The Signature class using the getInstance() method by specifing the algorith defined in Line 9
        System.out.println("Signaturee object :" + signature.toString());//We print the signature object.

    }catch(NoSuchAlgorithmException e){
        System.out.println("Exeption :" +e);// We catch the NoSuchAlgorithmException exception and print it.
    }
}
