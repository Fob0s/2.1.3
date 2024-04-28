import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean1 =  applicationContext.getBean("helloworld", HelloWorld.class);
        Cat cat = applicationContext.getBean("cat", Cat.class);
        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Сравнение 2 пар бинов по ссылке, HelloWorld " + bean.equals(bean1));
        System.out.println("Сравнение 2 пар бинов по ссылке, Cat " + cat.equals(cat1));
        System.out.println(bean.getMessage());
    }
}