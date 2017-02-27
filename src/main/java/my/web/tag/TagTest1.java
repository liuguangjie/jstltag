package my.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by free on 17-2-27.
 */
public class TagTest1 extends TagSupport {


    @Override
    public int doStartTag() throws JspException {

        return Tag.SKIP_BODY;
    }


}
