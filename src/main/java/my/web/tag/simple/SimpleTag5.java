package my.web.tag.simple;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by free on 17-2-27.
 */
public class SimpleTag5 extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException, IOException {

        this.getJspBody().invoke(null);

    }
}
