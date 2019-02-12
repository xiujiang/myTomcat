/**
 * @author liuxiujiang
 * @version 1.0
 * @datetime 2019/2/12
 * @since 1.8
 */
public abstract class MyServlet {
    public abstract void doGet(MyRequest myRequest,MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest,MyResponse myResponse);

    public void service(MyRequest myRequest,MyResponse myResponse){
        if(myRequest.getMethod().equalsIgnoreCase("POST")){
            doPost(myRequest,myResponse);
        }else if(myRequest.getMethod().equalsIgnoreCase("GET")){
            doGet(myRequest,myResponse);
        }
    }
}
