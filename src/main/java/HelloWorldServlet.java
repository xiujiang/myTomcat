import java.io.IOException;

/**
 * @author liuxiujiang
 * @version 1.0
 * @datetime 2019/2/12
 * @since 1.8
 */
public class HelloWorldServlet extends MyServlet{

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post world....");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
