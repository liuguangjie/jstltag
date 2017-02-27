package my.web.tag.simple;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

/**
 * Created by free on 17-2-27.
 */
public class SimpleTag4 extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException, IOException {

        JspFragment jf= this.getJspBody();
        StringWriter writer=new StringWriter();
        jf.invoke(writer);

        this.getJspContext().getOut().write(writer.toString().toUpperCase());
    }
}
