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

效果图
![image](https://github.com/user-attachments/assets/e24e2f14-7496-4bb4-9811-77b99d608a2f)
![image](https://github.com/user-attachments/assets/aa1b58e5-a486-4288-af65-755561033f9c)
![image](https://github.com/user-attachments/assets/af81464c-bf27-4ff8-b6e7-3f2aa84601c3)
![image](https://github.com/user-attachments/assets/506e889e-e3a2-44d3-8775-f2fe9f541cba)
![image](https://github.com/user-attachments/assets/af3e26c0-1d9a-4947-93f5-3a86d1a96637)


