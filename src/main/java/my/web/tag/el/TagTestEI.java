package my.web.tag.el;

import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import java.util.Enumeration;

/**
 * Created by free on 17-2-27.
 */
public class TagTestEI extends TagExtraInfo {

    @Override
    public boolean isValid(TagData data) {
        Enumeration<String> enumeration=data.getAttributes();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement()+"    ================");
        }

        return true;
    }
}
