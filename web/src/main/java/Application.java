import com.boom.base.web.listener.BoomApplicationEnvironmentPreparedEventListener;
import com.boom.base.web.listener.BoomApplicationFailedEventListener;
import com.boom.base.web.listener.BoomApplicationPreparedEventListener;
import com.boom.base.web.listener.BoomApplicationStartedEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@Import(MyBatisMapperScannerConfig.class)
@ComponentScan("com.boom.base")
@ServletComponentScan
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        ApplicationListener[] applicationListeners = new ApplicationListener[] {
                new BoomApplicationStartedEventListener(),
                new BoomApplicationEnvironmentPreparedEventListener(),
                new BoomApplicationPreparedEventListener(),
                new BoomApplicationFailedEventListener()
        };
        app.addListeners(applicationListeners);
        app.run(args);
    }
}
