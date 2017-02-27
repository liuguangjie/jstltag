package my.web.tag.simple;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by free on 17-2-27.
 */
public class SimpleTag2 extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException, IOException {

        throw  new SkipPageException();
    }
}
