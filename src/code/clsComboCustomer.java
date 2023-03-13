package code;

/**
 *
 * @author Andryan
 */
public class clsComboCustomer {
    private String key;
    private String value;
    
    public clsComboCustomer(String key, String value){
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
