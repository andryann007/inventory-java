package code;

/**
 *
 * @author Andryan
 */
public class clsComboBarang {
    private String key;
    private String value;
    
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
    
    public void setKey(String key){
        this.key = key;
    }
    
    public String getValue(){
        return value;
    }
    
    public void setValue(String value){
        this.value = value;
    }
}
