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
public class SimpleTag3 extends SimpleTagSupport {
    private Integer count=0;

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public void doTag() throws JspException, IOException {
        PageContext pageContext= (PageContext) this.getJspContext();
        HttpServletRequest request= (HttpServletRequest) pageContext.getRequest();
        System.out.println(request.getHeader("referer"));
        for (;count>0;count--){
            this.getJspBody().invoke(this.getJspContext().getOut());
        }
    }
}
