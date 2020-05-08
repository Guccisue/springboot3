package cn.cjy.Controller;

import cn.cjy.testBean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@Import(testBean.class)
public class testCompent {
}
