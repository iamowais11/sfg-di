package com.example.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")  //Must Be Active In Application Properties
@Service("i18nService")//Name Can Be provided to service as well
public class I18nEnglishService implements GreetingServices{
    @Override
    public String sayGreetings() {
        return "Hello In English";
    }
}
