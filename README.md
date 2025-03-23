项目导入jar包后需要的依赖

<!--引入AOP-->
<dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-aop</artifactId>
</dependency>

<!--        引入本地jar包-->
        <dependency>
            <groupId>com.example</groupId>
            <artifactId>Hungry</artifactId>
            <version>0.0.1-SNAPSHOT</version>
            <scope>system</scope>
<!--        <systemPath>C:/Users/adminstrator/Desktop/yourAbsolutePath/Hungry-0.0.1-SNAPSHOT.jar</systemPath>-->
            <systemPath>${project.basedir}/lib/Hungry-0.0.1-SNAPSHOT.jar</systemPath>
        </dependency>


如果无法运行则在主启动类中添加

@SpringBootApplication(scanBasePackages = {"com.example.hungry","com.example.demo"})
@EnableAspectJAutoProxy
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
