import java.util.ArrayList;
import java.util.List;

/**
 * @author liuxiujiang
 * @version 1.0
 * @datetime 2019/2/12
 * @since 1.8
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappings = new ArrayList<ServletMapping>();

    static {
        servletMappings.add(new ServletMapping("findGirl","/girl","FindGirlServlet"));
        servletMappings.add(new ServletMapping("helloWrold","/world","HelloWorldServlet"));

    }
}
