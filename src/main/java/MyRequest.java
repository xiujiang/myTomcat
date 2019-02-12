import java.io.IOException;
import java.io.InputStream;

/**
 * @author liuxiujiang
 * @version 1.0
 * @datetime 2019/2/12
 * @since 1.8
 */
public class MyRequest {
    private String url;
    private String method;
    public MyRequest(InputStream inputStream) throws IOException{

        String httpRequest = "";
        byte[] httpRequestBytes = new byte[1024];
        int length = 0;
        if((length = inputStream.read(httpRequestBytes)) > 0){
            httpRequest = new String(httpRequestBytes,0,length);
        }

        /**
         * HTTP请求协议
         * GET 、favicon.ico HTTP/1.1
         * Accept: * /*
         *
         */

        String httpHead = httpRequest.split("\n")[0];
        url = httpHead.split("\\s")[1];
        method = httpHead.split("\\s")[0];
        System.out.println(this);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
