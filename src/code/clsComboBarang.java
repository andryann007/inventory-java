package code;

/**
 *
 * @author Andryan
 */
public class clsComboBarang {
    private static String key;
    private static String value;
    
    public clsComboBarang(String key, String value){
        this.key = key;
        this.value = value;
    }
    
    @Override
    public String toString(){
        return key;
    }
    
    public String getKey(){
        return key;
    }
    
    public String getValue(){
        return value;
    }
}
