package com.utils.converter;

import com.utils.Converter;
import com.utils.StringUtils;

import java.util.UUID;

final class StringToUUIDConverter implements Converter<String, UUID> {
    @Override
    public UUID convert(String source) {
        if (StringUtils.hasLength(source)) {
            return UUID.fromString(source.trim());
        }
        return null;
    }
}
