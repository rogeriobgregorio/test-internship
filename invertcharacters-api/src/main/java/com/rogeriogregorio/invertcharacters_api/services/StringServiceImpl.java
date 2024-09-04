package com.rogeriogregorio.invertcharacters_api.services;

import org.springframework.stereotype.Service;

@Service
public class StringServiceImpl implements StringService{

    public String invert(String input) {
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }
}

