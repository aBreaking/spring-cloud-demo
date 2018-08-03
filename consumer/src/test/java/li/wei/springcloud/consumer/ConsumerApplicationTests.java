package li.wei.springcloud.consumer;

import li.wei.springcloud.consumer.service.ClientService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class ConsumerApplicationTests {

    @Resource
    ClientService clientService;

    @Test
    public void contextLoads() {
        String zhangsan = clientService.hello("zhangsan");
        System.err.println(zhangsan);
    }

}
