package my.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.Tag;
import java.io.IOException;

/**
 * Created by free on 17-2-27.
 */
public class TagTest4 extends BodyTagSupport {


    @Override
    public int doStartTag() throws JspException {
        return BodyTagSupport.EVAL_BODY_BUFFERED;
    }


    @Override
    public int doEndTag() throws JspException {
        String context=this.getBodyContent().getString();
        try {
            this.pageContext.getOut().write(context.toUpperCase());
        } catch (IOException e) {
            throw new JspException(e);
        }
        return Tag.EVAL_PAGE;
    }
}
