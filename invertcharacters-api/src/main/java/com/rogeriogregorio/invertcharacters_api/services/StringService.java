package com.rogeriogregorio.invertcharacters_api.services;

import org.springframework.stereotype.Component;

@Component
public interface StringService {

    String invert(String input);
}
