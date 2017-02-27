package my.web.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.IterationTag;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by free on 17-2-27.
 */
public class TagTest3 extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        return Tag.EVAL_BODY_INCLUDE;
    }
    private Integer count = 8;

    @Override
    public int doAfterBody() throws JspException {
        count--;
        if (count>0){
            return IterationTag.EVAL_BODY_AGAIN;
        }else {
            count=8;
            return IterationTag.EVAL_BODY_INCLUDE;
        }
    }
}
