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
![image](https://github.com/user-attachments/assets/0a98eaa7-bcf6-478e-bf02-e797aa71b74a)
![image](https://github.com/user-attachments/assets/6f3d3d99-8fde-4586-aa92-75e0eaac26f0)
![image](https://github.com/user-attachments/assets/4206f88f-2713-4a8c-a47e-cfb06f7fe150)
![image](https://github.com/user-attachments/assets/8b40dcf4-fc23-4641-8b01-fc60a8dc275d)
![image](https://github.com/user-attachments/assets/3a5b463b-9eae-4228-a148-ff722e490129)
