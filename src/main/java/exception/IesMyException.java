package exception;

public class IesMyException extends RuntimeException{

    public IesMyException(String s) {
        super(s);
    }

    public IesMyException(){
        super();
    }

}
