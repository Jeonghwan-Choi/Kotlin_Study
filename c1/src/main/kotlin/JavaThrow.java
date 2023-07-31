import kotlin.jvm.Throws;

import java.io.IOException;

public class JavaThrow {


    public void throwIOException() throws IOException {
//        throw new IOException("IOException Call");
    }

    public static void main(String[] args) {
        JavaThrow javaThrow = new JavaThrow();
        try{
            javaThrow.throwIOException();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
