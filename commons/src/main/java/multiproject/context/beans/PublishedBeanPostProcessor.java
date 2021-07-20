package multiproject.context.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class PublishedBeanPostProcessor implements BeanPostProcessor {
    private static final Class<Published> publishedAnnotation = Published.class;

    private final ConfigurableListableBeanFactory beanFactory;
    // private final ConfigurableListableBeanFactory parentBeanFactory;

    public PublishedBeanPostProcessor(ConfigurableListableBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
        // this.parentBeanFactory =
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
