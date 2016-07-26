package tr.edu.yildiz.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.transaction.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/tr/edu/yildiz/resources/spring/applicationContext.xml")
@Transactional
public class GenericTest extends Throwable {

}
