import com.lw.entity.FundAccountSituationEntity;
import com.lw.service.impl.AccountSituationServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountSituationServiceImpl service = context.getBean("accountSituationServiceImpl", AccountSituationServiceImpl.class);

        FundAccountSituationEntity query = new FundAccountSituationEntity();
        List<FundAccountSituationEntity> list = service.getList(query);
        System.out.println(list.size());

        for (FundAccountSituationEntity entity : list) {
            System.out.println(entity);
        }
    }
}
