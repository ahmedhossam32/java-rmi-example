package rmi;
import java.io.Serializable;

public class Result implements  Serializable {
    private int result;

    public Result() 
    {
        result=0;
    }

    public Result(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
}
