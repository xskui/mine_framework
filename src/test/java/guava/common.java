package guava;

import static com.google.common.base.Preconditions.*;
/**
 * Created by shukui.xing
 * date 2016/6/14.
 * desc:
 */
public class common {

    public static void main(String[] args) {
        try {
            checkArgument(false,"falsesssss");
        }catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println("finally");
        }
    }
}
