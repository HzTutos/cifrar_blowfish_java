import javax.crypto.*;
import javax.crypto.spec.*;

public class Criptografia{

    public static void main(String [] args){
        //System.out.println("Hola Mundo");
        
        String clave_insegura = "1234";

        for(int i = 0; i < 10; i++){
            setCifrado(clave_insegura);
            byte[] clave_segura = getCifrado();

            System.out.println(clave_segura);
        }
    }

    public static void setCifrado(String key){
        String clave = key;

        byte[] keyData = clave.getBytes();

        SecretKeySpec ks = new SecretKeySpec(keyData, "Blowfish");

        try{
    
            Cipher cp = Cipher.getInstance("Blowfish");

            cp.init(Cipher.ENCRYPT_MODE, ks);

            secureKey = cp.doFinal(clave.getBytes());

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static byte[] getCifrado(){
        return secureKey;
    }

    private static byte[] secureKey;

}
