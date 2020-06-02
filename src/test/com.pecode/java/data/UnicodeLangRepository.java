package data;

public class UnicodeLangRepository {

    private UnicodeLangRepository(){}

    public static UnicodeLangEntity getLatin(){
        return new UnicodeLangEntity('A', 26);
    }
}
