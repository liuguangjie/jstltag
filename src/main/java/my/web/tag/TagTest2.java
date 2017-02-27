package my.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by free on 17-2-27.
 */
public class TagTest2 extends TagSupport {


    @Override
    public int doEndTag() throws JspException {
        return Tag.EVAL_PAGE;
    }
}
