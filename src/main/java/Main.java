import com.alibaba.fastjson.JSON;
import com.lw.entity.FundAccountSituationEntity;
import com.lw.service.impl.AccountSituationServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountSituationServiceImpl service = context.getBean("accountSituationServiceImpl", AccountSituationServiceImpl.class);

        FundAccountSituationEntity query = new FundAccountSituationEntity();
        List<FundAccountSituationEntity> list = service.getList(query);
        System.out.println(list.size());

        for (FundAccountSituationEntity entity : list) {
//            log.info(JSON.toJSONString(entity));
            log.info("共有数据{}条",list.size());
        }
    }
}
